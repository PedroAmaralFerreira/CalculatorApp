
import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
		String operator;
		
		while (true) {
			operator = JOptionPane.showInputDialog("Enter the operator (+, -, * or /): ");	
			
			if (isValidOperator(operator))
				break;
			else
				JOptionPane.showMessageDialog(null, "INVALID! TRY AGAIN!");
		}
		
		int result = 0;
		
		switch (operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if (num2 != 0)
					result = num1 / num2;
				else
					JOptionPane.showMessageDialog(null, "You can't divide by zero.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "INVALID OPERATOR!");
				}
			JOptionPane.showMessageDialog(null, "The result is "+ result);
	}
	
	private static boolean isValidOperator(String operator) {
		return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"); 
	}
}