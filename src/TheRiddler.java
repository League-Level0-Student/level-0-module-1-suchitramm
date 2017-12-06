import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		int b = 1;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String cop = JOptionPane
				.showInputDialog("When i was 4 my brother was half my age now im 18 how old is my brother?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (cop.equals("16")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			b++;
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
			// 5. Otherwise, say "wrong" and tell them the answer
		}
			// 6. Add some more riddles

			// 2. Make a pop up to show the score.
			JOptionPane.showMessageDialog(null, "your score is" + b);
			cop = JOptionPane.showInputDialog("i have 7 sisters we all have brothers how many kids are in my family");
			// 4. If they got the answer right, pop up "correct!" and increase the score by
			// one
			if (cop.equals("15")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				b++;
			} else {
				JOptionPane.showMessageDialog(null, "incorrect");
				// 5. Otherwise, say "wrong" and tell them the answer

				// 6. Add some more riddles

				// 2. Make a pop up to show the score.
				JOptionPane.showMessageDialog(null, "your score is" + b);

			}
		

 cop = JOptionPane
.showInputDialog("what goes up when the rian goes down");
// 4. If they got the answer right, pop up "correct!" and increase the score by
// one
if (cop.equals("umbrella")) {
JOptionPane.showMessageDialog(null, "Correct!");
b++;
} else {
JOptionPane.showMessageDialog(null, "incorrect");
// 5. Otherwise, say "wrong" and tell them the answer

// 6. Add some more riddles

// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "your score is" + b);		
}	
		
	}}
