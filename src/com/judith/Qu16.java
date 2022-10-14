package com.judith;

public class Qu16 {

	public static void main(String[] args) {
		//What will be the output of the following program.


		char direction = 'N';
		char west = 'W';

		switch(direction) {
		case 'N':
		System.out.println("North");
		break;
		case 'E':
		System.out.println("East");
		break;
	//	case west:
	//	System.out.println("West");
		//break;
		case 'S':
		System.out.println("South");
		}

		//Answer: Running this will give compilation error since variable 'west'can not be used as case label
	}

}
