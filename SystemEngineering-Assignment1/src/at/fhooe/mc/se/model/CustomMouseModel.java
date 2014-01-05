/**
 * 
 */
package at.fhooe.mc.se.model;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;

import at.fhooe.mc.se.view.AssociationTextView;
import at.fhooe.mc.se.view.ClassBoxView;
import at.fhooe.mc.se.view.CommentBoxView;
import at.fhooe.mc.se.view.OvalPanelView;

/**
 * @author Shrikant Havale This event listener is specifically for the
 *         associations text fields, i.e. text fields created in editor. The
 *         class is implemented in such a way that it supports the dragging
 *         feature for the text fields.
 * 
 */
public class CustomMouseModel extends MouseInputAdapter {

	/**
	 * component which stores current text pane in focus
	 */
	private static Component componentInFocus = null;

	/**
	 * offset point
	 */
	private Point offset = new Point();

	/**
	 * flag used to check dragging
	 */
	private boolean dragging = false;

	/**
	 * move or stop move component
	 */
	private boolean shouldComponetMove = true;

	/**
	 * default constructor
	 */
	public CustomMouseModel() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	public void mousePressed(MouseEvent e) {
		// get the mouse pressed point
		Point p = e.getPoint();

		// capture the component
		AssociationTextView textfield = null;

		// capture the component
		CommentBoxView textArea = null;

		// capture the component
		ClassBoxView textPane = null;

		// capture the component
		OvalPanelView ovalPanelView = null;

		// check the instance
		if (e.getComponent() instanceof AssociationTextView) {

			textfield = (AssociationTextView) e.getComponent();

			// calculate the offset
			if (textfield.contains(p)) {
				offset.x = p.x - textfield.getX();
				offset.y = p.y - textfield.getY();
				dragging = true;
			}

			// capture the component in focus
			componentInFocus = e.getComponent();

			// set the first and second component clicked
			ApplicationEditorModel.getComponentsClicked().add(componentInFocus);

		} else if (e.getComponent() instanceof CommentBoxView) {

			textArea = (CommentBoxView) e.getComponent();

			// calculate the offset
			if (textArea.contains(p)) {
				offset.x = p.x - textArea.getX();
				offset.y = p.y - textArea.getY();
				dragging = true;
			}

			// capture the component in focus
			componentInFocus = e.getComponent();

			// set the first and second component clicked
			ApplicationEditorModel.getComponentsClicked().add(componentInFocus);

		} else if (e.getComponent() instanceof ClassBoxView) {

			textPane = (ClassBoxView) e.getComponent();

			// calculate the offset
			if (textPane.contains(p)) {
				offset.x = p.x - textPane.getX();
				offset.y = p.y - textPane.getY();
				dragging = true;
			}

			// capture the component in focus
			componentInFocus = e.getComponent();

			// set the first and second component clicked
			ApplicationEditorModel.getComponentsClicked().add(componentInFocus);

		} else if (e.getComponent() instanceof OvalPanelView) {

			ovalPanelView = (OvalPanelView) e.getComponent();

			// calculate the offset
			if (ovalPanelView.contains(p)) {
				offset.x = p.x - ovalPanelView.getX();
				offset.y = p.y - ovalPanelView.getY();
				dragging = true;
			}

			// capture the component in focus
			componentInFocus = e.getComponent();

			// set the first and second component clicked
			ApplicationEditorModel.getComponentsClicked().add(componentInFocus);

		}

	}

	/**
	 * {@inheritDoc}
	 */
	public void mouseReleased(MouseEvent e) {
		// turn off the dragging
		dragging = false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void mouseMoved(MouseEvent e) {

		// check if dragging is enabled and set the location and repaint the
		// component
		if (dragging && shouldComponetMove) {
			int x = e.getX() - offset.x;
			int y = e.getY() - offset.y;
			e.getComponent().setLocation(x, y);
			e.getComponent().repaint();
		}
	}

	public void mouseDragged(MouseEvent e) {

		// check if dragging is enabled and set the location and repaint the
		// component
		if (dragging && shouldComponetMove) {
			int x = e.getX() - offset.x;
			int y = e.getY() - offset.y;
			e.getComponent().setLocation(x, y);
			e.getComponent().repaint();
		}
	}

	/**
	 * @return the offset
	 */
	public Point getOffset() {
		return offset;
	}

	/**
	 * @param offset
	 *            the offset to set
	 */
	public void setOffset(Point offset) {
		this.offset = offset;
	}

	/**
	 * @return the dragging
	 */
	public boolean isDragging() {
		return dragging;
	}

	/**
	 * @param dragging
	 *            the dragging to set
	 */
	public void setDragging(boolean dragging) {
		this.dragging = dragging;
	}

	/**
	 * @return the Component
	 */
	public static Component getComponentInFocus() {
		return componentInFocus;
	}

	/**
	 * @param componentInFocus
	 *            the componentInFocus to set
	 */
	public static void setComponentInFocus(Component componentInFocus) {
		CustomMouseModel.componentInFocus = componentInFocus;
	}

	/**
	 * @return the shouldComponetMove
	 */
	public boolean isShouldComponetMove() {
		return shouldComponetMove;
	}

	/**
	 * @param shouldComponetMove
	 *            the shouldComponetMove to set
	 */
	public void setShouldComponetMove(boolean shouldComponetMove) {
		this.shouldComponetMove = shouldComponetMove;
	}

}
