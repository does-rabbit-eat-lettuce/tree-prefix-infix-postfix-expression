
public class Run {
  public static void main(String[] args) {
    ExpressionTree tree = new ExpressionTree("5 3 + 12 * 3 /");
    System.out.println("Expression Tree \n");
    System.out.println(tree + "\n");
    System.out.println("Eval:  " + tree.eval());
    System.out.println("Postfix:  " + tree.postfix());
    System.out.println("Prefix:  "+tree.prefix());
    System.out.println("Infix:  "+tree.infix());

    ExpressionTreeBrackets treeBrackets = new ExpressionTreeBrackets("5 3 + 12 * 3 /");
    System.out.println("Infix with better brackets:\n" + treeBrackets.infix() +"\n");
  }
}
