/* Generated By:JavaCC: Do not edit this line. ContextRuleParser.java */
package at.fhooe.mc.lbcas.contextrulejavacc;

import at.fhooe.mc.lbcas.contextruleparser.*;
import java.util.*;
import java.text.*;

@SuppressWarnings("all")
public class ContextRuleParser implements ContextRuleParserConstants {

  final public TreeNode execute() throws ParseException {
  TreeNode nodeA = null;
  TreeNode nodeB = null;
  TreeNode nodeC = null;
  TreeNode nodeD = null;
  TreeNode intermediateFirstNode = null;
  TreeNode intermediateSecondNode = null;
  TreeNode rootNode = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case POSITION_NOW:
    case DAYNIGHT_MODE:
    case LANGUAGE_MODE:
    case TIME_NOW:
    case TEMPERATURE_NOW:
      nodeA = variable_node_statement();
      rootNode = comparison_statement();
      nodeB = constant_node_statement();
    rootNode.setChildNodes(new TreeNode[]{nodeA,nodeB});
    rootNode.setRoot(rootNode);
    {if (true) return rootNode;}
      break;
    case AND:
    case OR:
      rootNode = logical_node_statement();
      jj_consume_token(OPENING_BRACKET);
      nodeA = variable_node_statement();
      intermediateFirstNode = comparison_statement();
      nodeB = constant_node_statement();
      jj_consume_token(COMMA);
      nodeC = variable_node_statement();
      intermediateSecondNode = comparison_statement();
      nodeD = constant_node_statement();
      jj_consume_token(CLOSING_BRACKET);
    intermediateFirstNode.setChildNodes(new TreeNode[]{nodeA,nodeB});
    intermediateFirstNode.setRoot(intermediateFirstNode);

    intermediateSecondNode.setChildNodes(new TreeNode[]{nodeC,nodeD});
    intermediateSecondNode.setRoot(intermediateSecondNode);

    rootNode.setChildNodes(new TreeNode[]{intermediateFirstNode,intermediateSecondNode});
    rootNode.setRoot(rootNode);

    {if (true) return rootNode;}
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

/******************************************************* Variable Nodes ********************************************************************/
  final public TreeNode variable_node_statement() throws ParseException {
  Token variableToken = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case POSITION_NOW:
      variableToken = jj_consume_token(POSITION_NOW);
    {if (true) return new PositionNowVariableNode();}
      break;
    case DAYNIGHT_MODE:
      variableToken = jj_consume_token(DAYNIGHT_MODE);
    {if (true) return new DayNightModeVariableNode();}
      break;
    case LANGUAGE_MODE:
      variableToken = jj_consume_token(LANGUAGE_MODE);
    {if (true) return new NationalityLanguageVariableNode();}
      break;
    case TIME_NOW:
      variableToken = jj_consume_token(TIME_NOW);
    {if (true) return new TimeNowVariableNode();}
      break;
    case TEMPERATURE_NOW:
      variableToken = jj_consume_token(TEMPERATURE_NOW);
    {if (true) return new TemperatureNowVariableNode();}
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

/******************************************************* Variable Nodes ********************************************************************/

/******************************************************* Comparison Nodes ********************************************************************/
  final public TreeNode comparison_statement() throws ParseException {
  TreeNode node = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EQUAL:
      node = equalto();
                   {if (true) return node;}
      break;
    case NOTEQUAL:
      node = notequalto();
                      {if (true) return node;}
      break;
    case GREATER:
      node = greaterthan();
                       {if (true) return node;}
      break;
    case LESS:
      node = lessthan();
                    {if (true) return node;}
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public ComparisonEqualNode equalto() throws ParseException {
  Token token;
    token = jj_consume_token(EQUAL);
    ComparisonEqualNode comparisonNode = new ComparisonEqualNode();
    {if (true) return comparisonNode;}
    throw new Error("Missing return statement in function");
  }

  final public ComparisonNotEqualNode notequalto() throws ParseException {
  Token token;
    token = jj_consume_token(NOTEQUAL);
    ComparisonNotEqualNode comparisonNode = new ComparisonNotEqualNode();
    {if (true) return comparisonNode;}
    throw new Error("Missing return statement in function");
  }

  final public ComparisonGreaterNode greaterthan() throws ParseException {
  Token token;
    token = jj_consume_token(GREATER);
    ComparisonGreaterNode comparisonNode = new ComparisonGreaterNode();
    {if (true) return comparisonNode;}
    throw new Error("Missing return statement in function");
  }

  final public ComparisonLessNode lessthan() throws ParseException {
  Token token;
    token = jj_consume_token(LESS);
    ComparisonLessNode comparisonNode = new ComparisonLessNode();
    {if (true) return comparisonNode;}
    throw new Error("Missing return statement in function");
  }

/******************************************************* Comparison Nodes ********************************************************************/



/******************************************************* Constant Nodes ********************************************************************/
  final public ConstantNode constant_node_statement() throws ParseException {
  Token token = null;
  ConstantNode constantNode = null;
  String time = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case UNIVERSITY_CAMPUS:
    case DAY:
    case NIGHT:
    case ENGLISH:
    case GERMAN:
      token = constanttoken();
    constantNode = new ConstantNode();
    constantNode.setValueForNode(token.image);
    {if (true) return constantNode;}
      break;
    case TIMECONSTANT:
      token = jj_consume_token(TIMECONSTANT);
        time = token.image;
        try
        {
            SimpleDateFormat df = new SimpleDateFormat("HH:mm");
            Date date = df.parse(time);
            constantNode = new ConstantNode();
            constantNode.setValueForNode(date);

        }
        catch(Exception exception)
        {
          exception.printStackTrace();
        }
    {if (true) return constantNode;}
      break;
    case TEMPERATURECONSTANT:
      token = temperatureconstant();
          Integer temperature = Integer.parseInt(token.image);
          constantNode = new ConstantNode();
          constantNode.setValueForNode(temperature);
          {if (true) return constantNode;}
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Token constanttoken() throws ParseException {
  Token token = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case UNIVERSITY_CAMPUS:
      token = jj_consume_token(UNIVERSITY_CAMPUS);
    {if (true) return token;}
      break;
    case DAY:
      token = jj_consume_token(DAY);
    {if (true) return token;}
      break;
    case NIGHT:
      token = jj_consume_token(NIGHT);
    {if (true) return token;}
      break;
    case GERMAN:
      token = jj_consume_token(GERMAN);
    {if (true) return token;}
      break;
    case ENGLISH:
      token = jj_consume_token(ENGLISH);
    {if (true) return token;}
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Token temperatureconstant() throws ParseException {
  Token token = null;
    token = jj_consume_token(TEMPERATURECONSTANT);
    {if (true) return token;}
    throw new Error("Missing return statement in function");
  }

  final public Token allNumbersOneOccurrence() throws ParseException {
  Token token = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMBERZERO:
      token = jj_consume_token(NUMBERZERO);
      break;
    case NUMBERONE:
      jj_consume_token(NUMBERONE);
      break;
    case NUMBERTWO:
      jj_consume_token(NUMBERTWO);
      break;
    case NUMBERTHREE:
      jj_consume_token(NUMBERTHREE);
      break;
    case NUMBERFOUR:
      jj_consume_token(NUMBERFOUR);
      break;
    case NUMBERFIVE:
      jj_consume_token(NUMBERFIVE);
      break;
    case NUMBERSIX:
      jj_consume_token(NUMBERSIX);
      break;
    case NUMBERSEVEN:
      jj_consume_token(NUMBERSEVEN);
      break;
    case NUMBEREIGHT:
      jj_consume_token(NUMBEREIGHT);
      break;
    case NUMBERNINE:
      jj_consume_token(NUMBERNINE);
           {if (true) return token;}
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

/******************************************************* Constant Nodes ********************************************************************/


/******************************************************* Logical Nodes ********************************************************************/
  final public TreeNode logical_node_statement() throws ParseException {
  Token token = null;
  TreeNode logicalNode = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AND:
      token = jj_consume_token(AND);
                logicalNode = new LogicalNodeAnd();
                {if (true) return logicalNode;}
      break;
    case OR:
      token = jj_consume_token(OR);
                logicalNode = new LogicalNodeOr();
                {if (true) return logicalNode;}
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public ContextRuleParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[7];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x7c600,0x7c000,0x1e0,0x18f80000,0xf80000,0xe0000000,0x600,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x7f,0x0,};
   }

  /** Constructor with InputStream. */
  public ContextRuleParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ContextRuleParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ContextRuleParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ContextRuleParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ContextRuleParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ContextRuleParser(ContextRuleParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ContextRuleParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[39];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 7; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 39; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
