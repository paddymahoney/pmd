/* Generated By:JJTree: Do not edit this line. ASTSchemaAttributeTest.java */

package net.sourceforge.pmd.jerry.ast.xpath;

public class ASTSchemaAttributeTest extends SimpleNode {
  public ASTSchemaAttributeTest(int id) {
    super(id);
  }

  public ASTSchemaAttributeTest(XPath2Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XPath2ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}