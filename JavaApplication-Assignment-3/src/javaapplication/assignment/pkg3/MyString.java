
package javaapplication.assignment.pkg3;

import java.util.ArrayList;
import java.util.HashMap;

public class MyString implements MyStringInterface {
	String inputString;
	int count = 0;
    int consonantsCount = 0;
    String consonantsInput;
    int indexPos;
    ArrayList<Character> consOutput = new ArrayList<Character>();
    String finalConsString = null;


	@Override
	public void setString(String string) {
		 inputString = string;

	}

	@Override
	public String getString() {
		return inputString;
	}

	@Override
	public String getConsonants() {
		String finalConsString = null;
		if (inputString == null) {
			finalConsString = null;
			System.out.println("New Method for Consonants gives: " + finalConsString);
		}
		else {
			char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q',
					'r', 's', 't', 'v', 'w', 'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 
					'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'  };
	        char[] inputCharArray = inputString.toCharArray();
	        for(int i = 0; i < inputCharArray.length; i++ ){
	            char currentChar = inputCharArray[i];        
	            for( int j = 0; j < consonants.length; j++ ) {
	            	char currentCon = consonants[j];
	            	if (currentChar == currentCon) {
	            		consonantsCount++;
	            		consOutput.add(currentChar);
	            	}
	            StringBuilder consonantString = new StringBuilder(consOutput.size());
	            for (Character ch: consOutput) {
	        	consonantString.append(ch);
	        	}
	        finalConsString = consonantString.toString();

	            }
	            	
	        }

			
		}
		System.out.println("New Method for Consonants gives: " + finalConsString);
		return finalConsString;
	}

	@Override
	public int numberOfConsonants() {
		String finalConsString = null;
		int num = 0;
		if (inputString == null)  {
			finalConsString = null;
			num = 0;
		}
		else {
			char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q',
					'r', 's', 't', 'v', 'w', 'x', 'y', 'z','B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 
					'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'  };
	        char[] inputCharArray = inputString.toCharArray();
	        for(int i = 0; i < inputCharArray.length; i++ ){
	            char currentChar = inputCharArray[i];        
	            for( int j = 0; j < consonants.length; j++ ) {
	            	char currentCon = consonants[j];
	            	if (currentChar == currentCon) {
	            		consonantsCount++;
	            		consOutput.add(currentChar);
	            	}
	            StringBuilder consonantString = new StringBuilder(consOutput.size());
	            for (Character ch: consOutput) {
	            	consonantString.append(ch);
	            }
	        finalConsString = consonantString.toString();
	        num = finalConsString.length();
	            }
		}
 
        }

    System.out.println("The Number of Consonants is: " + num);
	return num;
}
            

	@Override
	public char getCharacter(int position) throws IllegalArgumentException, IllegalIndexException {
		indexPos = position - 1;
		char charPosition;

		
		if (indexPos < 0) {
			System.out.println("Position cannot be less than 1");
			throw new IllegalArgumentException("Position cannot be less than 1");
		}
		else if (position > inputString.length()) {
			System.out.println("Position Greater than String Length");
			throw new IllegalIndexException ();
		}
		else
			System.out.println("The Character is:" + inputString.charAt(indexPos));

			charPosition = inputString.charAt(indexPos);
			
			return charPosition;
	}

	@Override
	public void flipCaseInSubstring(int startPosition, int endPosition)
			throws IllegalArgumentException, IllegalIndexException {
		int firstPos = startPosition -1;
		int lastPos = endPosition-1;
		int inputLength = inputString.length();
        ArrayList<Character> outputArray= new ArrayList<Character>();
  //      char beginChar;
        char changeChar;
        String finalString = null;
        
        if (firstPos < 0) {
			System.out.println("startPosition cannot be less than 1");
			throw new IllegalArgumentException ();
        }
        
        if (lastPos < 0) {
			System.out.println("endPosition cannot be less than 1");
			throw new IllegalArgumentException ();
        }
        
        if (endPosition > inputLength) {
			System.out.println("Position Greater than String Length");
			throw new IllegalIndexException ();
		}
        
        if (startPosition > endPosition) {
			System.out.println("Position Greater than String Length");
			throw new IllegalArgumentException ();
		}
        
        // Create a hash map
        HashMap<Character, Character> caseConv = new HashMap<Character, Character>();
        // Put elements to the map
        caseConv.put('a', 'A');
        caseConv.put('b', 'B');
        caseConv.put('c', 'C');
        caseConv.put('d', 'D');
        caseConv.put('e', 'E');
        caseConv.put('f', 'F');
        caseConv.put('g', 'G');
        caseConv.put('h', 'H');
        caseConv.put('i', 'I');
        caseConv.put('j', 'J');
        caseConv.put('k', 'K');
        caseConv.put('l', 'L');
        caseConv.put('m', 'M');
        caseConv.put('n', 'N');
        caseConv.put('o', 'O');
        caseConv.put('p', 'P');
        caseConv.put('q', 'Q');
        caseConv.put('r', 'R');
        caseConv.put('s', 'S');
        caseConv.put('t', 'T');
        caseConv.put('u', 'U');
        caseConv.put('v', 'V');
        caseConv.put('w', 'W');
        caseConv.put('x', 'X');
        caseConv.put('y', 'Y');
        caseConv.put('z', 'Z');
        caseConv.put('A', 'b');
        caseConv.put('B', 'b');
        caseConv.put('C', 'c');
        caseConv.put('D', 'd');
        caseConv.put('E', 'e');
        caseConv.put('F', 'f');
        caseConv.put('G', 'g');
        caseConv.put('H', 'h');
        caseConv.put('I', 'i');
        caseConv.put('J', 'j');
        caseConv.put('K', 'k');
        caseConv.put('L', 'l');
        caseConv.put('M', 'm');
        caseConv.put('N', 'n');
        caseConv.put('O', 'o');
        caseConv.put('P', 'p');
        caseConv.put('Q', 'q');
        caseConv.put('R', 'r');
        caseConv.put('S', 's');
        caseConv.put('T', 't');
        caseConv.put('U', 'u');
        caseConv.put('V', 'v');
        caseConv.put('W', 'w');
        caseConv.put('X', 'x');
        caseConv.put('Y', 'y');
        caseConv.put('Z', 'z');
        
        System.out.println(inputString);
        char[] inputCharArray = inputString.toCharArray();
                for (int i = 0; i <= (firstPos -1); i++){
        	outputArray.add(inputCharArray[i]);
        }

        for(int j = firstPos; j <= lastPos; j++ ){
        	changeChar = inputCharArray[j];
        	if (caseConv.containsKey(inputCharArray[j]))
        	outputArray.add(caseConv.get(changeChar));
        	else 
        		outputArray.add(inputCharArray[j]);
        }

        for(int k = (lastPos+1); k < inputCharArray.length; k++ ) {
        	outputArray.add(inputCharArray[k]);
        }

        StringBuilder finalOutput = new StringBuilder();
        for (char s : outputArray)
        {
        	finalOutput.append(s);
        }
        System.out.println(finalOutput);
        
        finalString = finalOutput.toString();
        setString(finalString);
        }
        



	public static void main(String[] args) {

	}

}
