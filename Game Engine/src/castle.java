package utilities;

import java.util.Scanner;

public class GameEng {
	public static Scanner userinputgetter;
	public static String currentuserinput;

	public static Knight DarkKnight;
	public static Soldier SuperSoldier;
	public static Fairy MysticFairies;
	public static Valk Valkaryies;



	public static void main(String[]args){

		Soldier = new SuperSoldier();
		Knight = new DarkKnight();
		Fairy = new MysticFairies();
    Valk = new Valkaryies();
		userinputgetter= new Scanner(System.in);
		selectAttack();
	}


	public static void selectAttack(){
		System.out.println("Choose Attacker: Soldier, Knight, Archer");
		currentuserinput=userinputgetter.nextLine();

		if(currentuserinput.equals("soldier")){
			chooseSoldierAttack(soldier , "soldier");
		}
		if(currentuserinput.equals("knight")){
			chooseKnightAttack(knight, "knight");
		}
		if(currentuserinput.equals("archer")){
			getArcherAttack(archer, "knight");
		}

	}


	public static void getKingNm(Castle army, String Whisperer){
		System.out.println("The King's name is " + army.getKing());
		selectWhichAttack();
	}
	public static void getQueenNm(Castle army, String Whisperer){
		System.out.println("The Queen's name is " + army.getQueen());
		selectWhichAttack();
	}
	public static void getStableNm(Castle army, String Whisperer){
		System.out.println("The Stable's name is " + army.getStable());
		selectWhichAttack();
	}
	public static void getPrincessNm(Castle army, String Whisperer){
		System.out.println("The Princess' name is " + army.getPrincess());
		selectWhichAttack();
	}
	public static void getPrinceNm(Castle army, String Whisperer){
		System.out.println("The Prince's name is " + army.getPrince());
		selectWhichAttack();
	}


	public static void getTotalPop(Castle army, String Whisperer){
		System.out.println("The total population is " + army.calcPopCnt());
		selectWhichAttack();
	}
	public static void getTotalArmy(Castle army, String Whisperer){
		System.out.println("The total army population is " + army.calcArmyCnt());
		selectWhichAttack();
	}


	public static void getSoldierAttack(Soldier army, String soldier) {
		System.out.println("Which attack would you like to use: Shoot or Tank");
		currentuserinput=userinputgetter.nextLine();
		getSoldierAttackPropertyValue(army, soldier);
	}
	public static void getKnightAttack(Knight army, String knight){
		System.out.println("Which attack would you like to use: Poke or Stab");
		currentuserinput=userinputgetter.nextLine();
		getKnightAttackPropertyValue(army, knight);
	}
	public static void getArcherAttack(Archer army, String archer){
		System.out.println("Which attack would you like to use: Shoot or Fire Arrow");
		currentuserinput=userinputgetter.nextLine();
		getArcherAttackPropertyValue(army, archer);
	}


	public static void getSoldierAttackPropertyValue(Soldier army, String soldier){
		if(currentuserinput.equals("shoot")){
			System.out.println("The " + soldier + " does " + army.getSoldierShoot() + " damage.");
			selectWhichAttack();
		}
		if(currentuserinput.equals("tank")){
			System.out.println("The " + soldier + " does " + army.getSoldierTank() + " damage.");
			selectWhichAttack();
		}
	}
	public static void getKnightAttackPropertyValue(Knight army, String knight){
		if(currentuserinput.equals("poke")){
			System.out.println("The " + knight + " does " + army.getKnightPoke() + " damage.");
			selectWhichAttack();
		}
		if(currentuserinput.equals("stab")){
			System.out.println("The " + knight + " does " + army.getKnightStab() + " damage.");
			selectWhichAttack();
		}
	}
	public static void getArcherAttackPropertyValue(Archer army, String archer){
		if(currentuserinput.equals("archer")){
			System.out.println("The" + soldier + "does" + army.getArcherShoot() + " damage.");
			selectWhichAttack();
		}
		if(currentuserinput.equals("tank")){
			System.out.println("The" + soldier + "does" + army.getArcherFireArr() + " damage.");
			selectWhichAttack();
		}
	}
}
