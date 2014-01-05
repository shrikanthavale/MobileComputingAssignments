/**
 * 
 */
package at.fhooe.mc.se.model;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import at.fhooe.mc.se.util.Constants;
import at.fhooe.mc.se.view.AssociationTextView;
import at.fhooe.mc.se.view.ClassBoxView;
import at.fhooe.mc.se.view.CommentBoxView;
import at.fhooe.mc.se.view.DrawingAreaView;
import at.fhooe.mc.se.view.OvalPanelView;

/**
 * @author Shrikant Havale
 * 
 */
public class ApplicationEditorModel {

	private DrawingAreaView drawingAreaView = DrawingAreaView.getInstance();

	/**
	 * first component clicked
	 */
	private static List<Component> componentsClicked = new ArrayList<>();

	/**
	 * initial x-position where text pane should be created
	 */
	private static int xPositionComponent = 200;

	/**
	 * initial y-position where text pane should be created
	 */
	private static int yPositionComponent = 35;

	public void paintComponents(Graphics g) {

		// get the start positions
		List<Point> tempStartPosition = Constants.getxPositionPointMap();

		// get the end positions
		List<Point> tempEndPosition = Constants.getyPositionPointMap();

		// draw the associations every time, as they disappear when repaint
		// method is called
		for (int tempCount = 0; tempCount < tempStartPosition.size(); tempCount++) {
			Point pointStart = tempStartPosition.get(tempCount);
			Point pointEnd = tempEndPosition.get(tempCount);
			g.setColor(Color.BLUE);

			g.drawLine(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);
			// just to make line more thick
			g.drawLine(pointStart.x, pointStart.y + 1, pointEnd.x,
					pointEnd.y + 1);
			g.drawLine(pointStart.x, pointStart.y + 2, pointEnd.x,
					pointEnd.y + 2);
		}
	}

	/**
	 * This methods creates the text panes, nothing but classes for our class
	 * diagrams
	 */
	public void createTextPane() {

		// adjust the position accordingly every time, so that don't overlap
		// each other
		xPositionComponent = xPositionComponent + 20;
		yPositionComponent = yPositionComponent + 20;

		// create new JTextpane as it is editable in rectangle format
		ClassBoxView textPane = new ClassBoxView(xPositionComponent,
				yPositionComponent);

		// add the text pane created
		drawingAreaView.add(textPane);

		// repaint the application editor to make the component visible
		drawingAreaView.repaint();

	}

	/**
	 * creates new association which can be attached to the links in the class
	 * diagram
	 */
	public void createAssociation() {

		// create the association between two components by drawing line
		Component firstComponent = ApplicationEditorModel
				.getComponentsClicked()
				.get(ApplicationEditorModel.getComponentsClicked().size() - 2);
		Component secondComponent = ApplicationEditorModel
				.getComponentsClicked()
				.get(ApplicationEditorModel.getComponentsClicked().size() - 1);

		if (checkAssociations(firstComponent, secondComponent)) {

			int xPositionFirstComponent = firstComponent.getLocation().x;
			int yPositionFirstComponent = firstComponent.getLocation().y;

			int xPositionSecondComponent = secondComponent.getLocation().x;
			int yPositionSecondComponent = secondComponent.getLocation().y;

			if (xPositionFirstComponent < xPositionSecondComponent) {

				xPositionFirstComponent = xPositionFirstComponent
						+ firstComponent.getWidth();
				yPositionFirstComponent = yPositionFirstComponent
						+ firstComponent.getHeight() / 2;

				xPositionSecondComponent = secondComponent.getLocation().x;
				yPositionSecondComponent = yPositionSecondComponent
						+ secondComponent.getHeight() / 2;

				Constants.getxPositionPointMap().add(
						new Point(xPositionFirstComponent,
								yPositionFirstComponent));
				Constants.getyPositionPointMap().add(
						new Point(xPositionSecondComponent,
								yPositionSecondComponent));

			} else {

				xPositionFirstComponent = firstComponent.getLocation().x;
				yPositionFirstComponent = yPositionFirstComponent
						+ firstComponent.getHeight() / 2;

				xPositionSecondComponent = xPositionSecondComponent
						+ secondComponent.getWidth();
				yPositionSecondComponent = yPositionSecondComponent
						+ secondComponent.getHeight() / 2;

				Constants.getxPositionPointMap().add(
						new Point(xPositionFirstComponent,
								yPositionFirstComponent));
				Constants.getyPositionPointMap().add(
						new Point(xPositionSecondComponent,
								yPositionSecondComponent));

			}

			MouseListener[] mouseListenerFirstComponent = firstComponent
					.getMouseListeners();

			for (MouseListener tempMouseListener : mouseListenerFirstComponent) {
				if (tempMouseListener instanceof CustomMouseModel) {
					CustomMouseModel customMouseModel = (CustomMouseModel) tempMouseListener;
					customMouseModel.setShouldComponetMove(false);
				}
			}

			MouseListener[] mouseListenerSecondComponent = secondComponent
					.getMouseListeners();
			for (MouseListener tempMouseListener : mouseListenerSecondComponent) {
				if (tempMouseListener instanceof CustomMouseModel) {
					CustomMouseModel customMouseModel = (CustomMouseModel) tempMouseListener;
					customMouseModel.setShouldComponetMove(false);
				}
			}
		}

		// repaint the application editor
		drawingAreaView.repaint();
	}

	/**
	 * creates new association text which can be attached to the links in the
	 * class diagram
	 */
	public void createAssociationText() {

		// adjust the position accordingly every time, so that don't overlap
		// each other
		xPositionComponent = xPositionComponent + 20;
		yPositionComponent = yPositionComponent + 20;

		// create the new text field
		AssociationTextView associationTextView = new AssociationTextView(
				xPositionComponent, yPositionComponent);
		// add the field to text pane
		drawingAreaView.add(associationTextView);

		// repaint the application editor
		drawingAreaView.repaint();
	}

	/**
	 * create a comment box
	 */

	public void createCommentBox() {

		// adjust the position accordingly every time, so that don't overlap
		// each other
		xPositionComponent = xPositionComponent + 20;
		yPositionComponent = yPositionComponent + 20;

		// create the new text field
		CommentBoxView commentBox = new CommentBoxView(xPositionComponent,
				yPositionComponent);

		// add the field to text pane
		drawingAreaView.add(commentBox);

		// repaint the application editor
		drawingAreaView.repaint();
	}

	/**
	 * remove association
	 */
	public void removeAssociation() {

		// create the association between two components by drawing line
		Component firstComponent = ApplicationEditorModel
				.getComponentsClicked()
				.get(ApplicationEditorModel.getComponentsClicked().size() - 2);

		Component secondComponent = ApplicationEditorModel
				.getComponentsClicked()
				.get(ApplicationEditorModel.getComponentsClicked().size() - 1);

		int xPositionFirstComponent = firstComponent.getLocation().x;
		int yPositionFirstComponent = firstComponent.getLocation().y;

		int xPositionSecondComponent = secondComponent.getLocation().x;
		int yPositionSecondComponent = secondComponent.getLocation().y;

		if (xPositionFirstComponent < xPositionSecondComponent) {
			xPositionFirstComponent = xPositionFirstComponent
					+ firstComponent.getWidth();
			yPositionFirstComponent = yPositionFirstComponent
					+ firstComponent.getHeight() / 2;

			xPositionSecondComponent = secondComponent.getLocation().x;
			yPositionSecondComponent = yPositionSecondComponent
					+ secondComponent.getHeight() / 2;

			Constants.getxPositionPointMap()
					.remove(new Point(xPositionFirstComponent,
							yPositionFirstComponent));
			Constants.getyPositionPointMap().remove(
					new Point(xPositionSecondComponent,
							yPositionSecondComponent));
		} else {

			xPositionFirstComponent = firstComponent.getLocation().x;
			yPositionFirstComponent = yPositionFirstComponent
					+ firstComponent.getHeight() / 2;

			xPositionSecondComponent = xPositionSecondComponent
					+ secondComponent.getWidth();
			yPositionSecondComponent = yPositionSecondComponent
					+ secondComponent.getHeight() / 2;

			Constants.getxPositionPointMap()
					.remove(new Point(xPositionFirstComponent,
							yPositionFirstComponent));
			Constants.getyPositionPointMap().remove(
					new Point(xPositionSecondComponent,
							yPositionSecondComponent));
		}

		MouseListener[] mouseListenerFirstComponent = firstComponent
				.getMouseListeners();

		for (MouseListener tempMouseListener : mouseListenerFirstComponent) {
			if (tempMouseListener instanceof CustomMouseModel) {
				CustomMouseModel customMouseModel = (CustomMouseModel) tempMouseListener;
				customMouseModel.setShouldComponetMove(true);
			}
		}

		MouseListener[] mouseListenerSecondComponent = secondComponent
				.getMouseListeners();
		for (MouseListener tempMouseListener : mouseListenerSecondComponent) {
			if (tempMouseListener instanceof CustomMouseModel) {
				CustomMouseModel customMouseModel = (CustomMouseModel) tempMouseListener;
				customMouseModel.setShouldComponetMove(true);
			}
		}

		drawingAreaView.repaint();

	}

	/**
	 * Delete Rectangle or Class
	 */
	public void deleteClass() {
		if (CustomMouseModel.getComponentInFocus() != null)
			DrawingAreaView.getInstance().remove(
					CustomMouseModel.getComponentInFocus());
		drawingAreaView.repaint();
	}

	/**
	 * delete comment
	 */
	public void deleteComment() {
		if (CustomMouseModel.getComponentInFocus() != null)
			DrawingAreaView.getInstance().remove(
					CustomMouseModel.getComponentInFocus());
		drawingAreaView.repaint();
	}

	/**
	 * delete association text
	 */
	public void deleteAssociationText() {
		if (CustomMouseModel.getComponentInFocus() != null)
			DrawingAreaView.getInstance().remove(
					CustomMouseModel.getComponentInFocus());
		drawingAreaView.repaint();
	}

	/**
	 * remove all associations
	 */
	public void removeAllAssociations() {
		Constants.getxPositionPointMap().clear();
		Constants.getyPositionPointMap().clear();
		for (Component temComponent : DrawingAreaView.getInstance()
				.getComponents()) {
			if (temComponent instanceof AssociationTextView) {
				DrawingAreaView.getInstance().remove(temComponent);
			}

		}
		drawingAreaView.repaint();
	}

	/**
	 * refresh all editor deletes all the components
	 */
	public void refreshEditor() {
		Constants.getxPositionPointMap().clear();
		Constants.getyPositionPointMap().clear();
		for (Component temComponent : DrawingAreaView.getInstance()
				.getComponents()) {
			if (temComponent instanceof ClassBoxView
					|| temComponent instanceof CommentBoxView
					|| temComponent instanceof AssociationTextView
					|| temComponent instanceof OvalPanelView) {
				DrawingAreaView.getInstance().remove(temComponent);
			}

		}
		drawingAreaView.repaint();
	}

	public void createState() {
		// adjust the position accordingly every time, so that don't overlap
		// each other
		xPositionComponent = xPositionComponent + 20;
		yPositionComponent = yPositionComponent + 20;

		// create the new text field
		OvalPanelView ovalPanelView = new OvalPanelView(xPositionComponent,
				yPositionComponent);

		// add the field to text pane
		drawingAreaView.add(ovalPanelView);

		// repaint the application editor
		drawingAreaView.repaint();

	}

	public void deleteState() {
		if (CustomMouseModel.getComponentInFocus() != null)
			DrawingAreaView.getInstance().remove(
					CustomMouseModel.getComponentInFocus());
		drawingAreaView.repaint();
	}

	public void createDirectedLine() {

		// create the association between two components by drawing line
		Component firstComponent = ApplicationEditorModel
				.getComponentsClicked()
				.get(ApplicationEditorModel.getComponentsClicked().size() - 2);
		Component secondComponent = ApplicationEditorModel
				.getComponentsClicked()
				.get(ApplicationEditorModel.getComponentsClicked().size() - 1);

		if (checkAssociations(firstComponent, secondComponent)) {

			int xPositionFirstComponent = firstComponent.getLocation().x;
			int yPositionFirstComponent = firstComponent.getLocation().y;

			int xPositionSecondComponent = secondComponent.getLocation().x;
			int yPositionSecondComponent = secondComponent.getLocation().y;

			if (xPositionFirstComponent < xPositionSecondComponent) {

				xPositionFirstComponent = xPositionFirstComponent
						+ firstComponent.getWidth();
				yPositionFirstComponent = yPositionFirstComponent
						+ firstComponent.getHeight() / 2;

				xPositionSecondComponent = secondComponent.getLocation().x;
				yPositionSecondComponent = yPositionSecondComponent
						+ secondComponent.getHeight() / 2;

				Constants.getxPositionPointMap().add(
						new Point(xPositionFirstComponent,
								yPositionFirstComponent));
				Constants.getyPositionPointMap().add(
						new Point(xPositionSecondComponent,
								yPositionSecondComponent));

				Constants.getxPositionPointMap().add(
						new Point(xPositionSecondComponent,
								yPositionSecondComponent));
				Constants.getyPositionPointMap().add(
						new Point(xPositionSecondComponent - 20,
								yPositionSecondComponent + 20));

				Constants.getxPositionPointMap().add(
						new Point(xPositionSecondComponent,
								yPositionSecondComponent));
				Constants.getyPositionPointMap().add(
						new Point(xPositionSecondComponent - 20,
								yPositionSecondComponent - 20));
			} else {

				xPositionFirstComponent = firstComponent.getLocation().x;
				yPositionFirstComponent = yPositionFirstComponent
						+ firstComponent.getHeight() / 2;

				xPositionSecondComponent = xPositionSecondComponent
						+ secondComponent.getWidth();
				yPositionSecondComponent = yPositionSecondComponent
						+ secondComponent.getHeight() / 2;

				Constants.getxPositionPointMap().add(
						new Point(xPositionFirstComponent,
								yPositionFirstComponent));
				Constants.getyPositionPointMap().add(
						new Point(xPositionSecondComponent,
								yPositionSecondComponent));

				Constants.getxPositionPointMap().add(
						new Point(xPositionSecondComponent,
								yPositionSecondComponent));
				Constants.getyPositionPointMap().add(
						new Point(xPositionSecondComponent + 20,
								yPositionSecondComponent + 20));

				Constants.getxPositionPointMap().add(
						new Point(xPositionSecondComponent,
								yPositionSecondComponent));
				Constants.getyPositionPointMap().add(
						new Point(xPositionSecondComponent + 20,
								yPositionSecondComponent - 20));

			}

			MouseListener[] mouseListenerFirstComponent = firstComponent
					.getMouseListeners();

			for (MouseListener tempMouseListener : mouseListenerFirstComponent) {
				if (tempMouseListener instanceof CustomMouseModel) {
					CustomMouseModel customMouseModel = (CustomMouseModel) tempMouseListener;
					customMouseModel.setShouldComponetMove(false);
				}
			}

			MouseListener[] mouseListenerSecondComponent = secondComponent
					.getMouseListeners();
			for (MouseListener tempMouseListener : mouseListenerSecondComponent) {
				if (tempMouseListener instanceof CustomMouseModel) {
					CustomMouseModel customMouseModel = (CustomMouseModel) tempMouseListener;
					customMouseModel.setShouldComponetMove(false);
				}
			}
		}

		// repaint the application editor
		drawingAreaView.repaint();
	}

	public void deleteDirectedLine() {

		// create the association between two components by drawing line
		Component firstComponent = ApplicationEditorModel
				.getComponentsClicked()
				.get(ApplicationEditorModel.getComponentsClicked().size() - 2);

		Component secondComponent = ApplicationEditorModel
				.getComponentsClicked()
				.get(ApplicationEditorModel.getComponentsClicked().size() - 1);

		int xPositionFirstComponent = firstComponent.getLocation().x;
		int yPositionFirstComponent = firstComponent.getLocation().y;

		int xPositionSecondComponent = secondComponent.getLocation().x;
		int yPositionSecondComponent = secondComponent.getLocation().y;

		if (xPositionFirstComponent < xPositionSecondComponent) {

			xPositionFirstComponent = xPositionFirstComponent
					+ firstComponent.getWidth();
			yPositionFirstComponent = yPositionFirstComponent
					+ firstComponent.getHeight() / 2;

			xPositionSecondComponent = secondComponent.getLocation().x;
			yPositionSecondComponent = yPositionSecondComponent
					+ secondComponent.getHeight() / 2;

			Constants.getxPositionPointMap()
					.remove(new Point(xPositionFirstComponent,
							yPositionFirstComponent));
			Constants.getyPositionPointMap().remove(
					new Point(xPositionSecondComponent,
							yPositionSecondComponent));

			Constants.getxPositionPointMap().remove(
					new Point(xPositionSecondComponent,
							yPositionSecondComponent));
			Constants.getyPositionPointMap().remove(
					new Point(xPositionSecondComponent - 20,
							yPositionSecondComponent + 20));

			Constants.getxPositionPointMap().remove(
					new Point(xPositionSecondComponent,
							yPositionSecondComponent));
			Constants.getyPositionPointMap().remove(
					new Point(xPositionSecondComponent - 20,
							yPositionSecondComponent - 20));
		} else {

			xPositionFirstComponent = firstComponent.getLocation().x;
			yPositionFirstComponent = yPositionFirstComponent
					+ firstComponent.getHeight() / 2;

			xPositionSecondComponent = xPositionSecondComponent
					+ secondComponent.getWidth();
			yPositionSecondComponent = yPositionSecondComponent
					+ secondComponent.getHeight() / 2;

			Constants.getxPositionPointMap()
					.remove(new Point(xPositionFirstComponent,
							yPositionFirstComponent));
			Constants.getyPositionPointMap().remove(
					new Point(xPositionSecondComponent,
							yPositionSecondComponent));

			Constants.getxPositionPointMap().remove(
					new Point(xPositionSecondComponent,
							yPositionSecondComponent));
			Constants.getyPositionPointMap().remove(
					new Point(xPositionSecondComponent + 20,
							yPositionSecondComponent + 20));

			Constants.getxPositionPointMap().remove(
					new Point(xPositionSecondComponent,
							yPositionSecondComponent));
			Constants.getyPositionPointMap().remove(
					new Point(xPositionSecondComponent + 20,
							yPositionSecondComponent - 20));

		}

		MouseListener[] mouseListenerFirstComponent = firstComponent
				.getMouseListeners();

		for (MouseListener tempMouseListener : mouseListenerFirstComponent) {
			if (tempMouseListener instanceof CustomMouseModel) {
				CustomMouseModel customMouseModel = (CustomMouseModel) tempMouseListener;
				customMouseModel.setShouldComponetMove(true);
			}
		}

		MouseListener[] mouseListenerSecondComponent = secondComponent
				.getMouseListeners();
		for (MouseListener tempMouseListener : mouseListenerSecondComponent) {
			if (tempMouseListener instanceof CustomMouseModel) {
				CustomMouseModel customMouseModel = (CustomMouseModel) tempMouseListener;
				customMouseModel.setShouldComponetMove(true);
			}
		}

		drawingAreaView.repaint();

	}

	private boolean checkAssociations(Component firstComponent,
			Component secondComponent) {

		boolean validated = true;

		if ((firstComponent instanceof CommentBoxView && secondComponent instanceof AssociationTextView)
				|| (firstComponent instanceof AssociationTextView && secondComponent instanceof CommentBoxView)) {

			JOptionPane.showMessageDialog(drawingAreaView,
					"Association Text and Comment Box cannot be connected",
					"Error !!!! ", JOptionPane.ERROR_MESSAGE);
			validated = false;

		} else if ((firstComponent instanceof CommentBoxView && secondComponent instanceof OvalPanelView)
				|| (firstComponent instanceof OvalPanelView && secondComponent instanceof CommentBoxView)) {

			JOptionPane.showMessageDialog(drawingAreaView,
					"State and Comment Box cannot be connected", "Error !!!! ",
					JOptionPane.ERROR_MESSAGE);
			validated = false;

		} else if ((firstComponent instanceof OvalPanelView && secondComponent instanceof AssociationTextView)
				|| (firstComponent instanceof AssociationTextView && secondComponent instanceof OvalPanelView)) {

			JOptionPane.showMessageDialog(drawingAreaView,
					"Association Text and State cannot be connected",
					"Error !!!! ", JOptionPane.ERROR_MESSAGE);
			validated = false;

		} else if ((firstComponent instanceof ClassBoxView && secondComponent instanceof OvalPanelView)
				|| (firstComponent instanceof OvalPanelView && secondComponent instanceof ClassBoxView)) {

			JOptionPane.showMessageDialog(drawingAreaView,
					"Class and State cannot be connected", "Error !!!! ",
					JOptionPane.ERROR_MESSAGE);
			validated = false;

		} else if ((firstComponent instanceof AssociationTextView && secondComponent instanceof ClassBoxView)
				|| (firstComponent instanceof ClassBoxView && secondComponent instanceof AssociationTextView)) {

			JOptionPane.showMessageDialog(drawingAreaView,
					"Class and State cannot be connected", "Error !!!! ",
					JOptionPane.ERROR_MESSAGE);
			validated = false;

		} else if ((firstComponent instanceof CommentBoxView && secondComponent instanceof CommentBoxView)
				|| (firstComponent instanceof AssociationTextView && secondComponent instanceof AssociationTextView)) {

			JOptionPane.showMessageDialog(drawingAreaView,
					"Self Connection Not Possible", "Error !!!! ",
					JOptionPane.ERROR_MESSAGE);
			validated = false;

		}

		return validated;
	}

	/**
	 * @return the componentsClicked
	 */
	public static List<Component> getComponentsClicked() {
		return componentsClicked;
	}

	/**
	 * @param componentsClicked
	 *            the componentsClicked to set
	 */
	public static void setComponentsClicked(List<Component> componentsClicked) {
		ApplicationEditorModel.componentsClicked = componentsClicked;
	}

}
