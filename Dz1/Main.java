import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	int a=0; int b=0; int c=0; int sum=0; int min=0; int max=0; int i=0; int j=0; boolean q=true;
	Scanner sc = new  Scanner(System.in);
	Scanner sc2 = new  Scanner(System.in);
	String z="";
/*
//Zadanie 1:
	System.out.println("Hello world");

//Zadanie 2:
	System.out.println("Lukashevich");
	System.out.println("Pavel");
	System.out.println("Mikhailovich");

//Zadanie 3:
	a=6; b=7; sum=a+b;
	System.out.println(sum);
	
//Zadanie 4:
	
	System.out.print("Vvedite celoe chislo a ");
	a=sc.nextInt();	
	System.out.println("");
	System.out.print("Vvedite celoe chislo b ");
	b=sc.nextInt();	
	System.out.println("");
	System.out.print("Vvedite znak deystviya ");
	z=sc2.nextLine();
	switch(z){
	case "+":{System.out.println("a + b = "+(a+b)); break;}
	case "-":{System.out.println("a - b = "+(a-b)); break;}
	case "/":{System.out.println("a / b = "+(a/b)); break;}
	case "*":{System.out.println("a * b = "+(a*b)); break;}
	default:{System.out.print("Vveden nekorrektniy znak deystviya ");}
	}

//Zadanie 5:
	System.out.println("Vvedite chislo ot 0 do 9 ");
	a=sc.nextInt();	
	switch (a){
	case 0:{System.out.println("Zero"); break;}
	case 1:{System.out.println("One"); break;}
	case 2:{System.out.println("Two"); break;}
	case 3:{System.out.println("Three"); break;}
	case 4:{System.out.println("Four"); break;}
	case 5:{System.out.println("Five"); break;}
	case 6:{System.out.println("Six"); break;}
	case 7:{System.out.println("Seven"); break;}
	case 8:{System.out.println("Eight"); break;}
	case 9:{System.out.println("Nine"); break;}
	default:{System.out.print("Vvedeno chislo menshe 0 ili bolshe 9 ");}
	}
	
//Zadanie 6: 	
	System.out.println("Vvedite chislo ot 0 do 9 ");
	a=sc.nextInt();	
	if (a%2==0) {System.out.println("Chislo chetnoe");} //Если остаток от деления на 2 равен 0 значит число четное 
	else {System.out.println("Chislo Nechetnoe");}

//Zadanie 7: 		
	System.out.println("Vvedite celoe chislo ot -9 do 9 ");
	a=sc.nextInt();	
	if (a>0){System.out.println("Chislo polojitelnoe");}
	if (a<0){System.out.println("Chislo otricatelnoe");}
	if (a==0){System.out.println("Chislo ravno 0");}

//Zadanie 8: 	
	System.out.print("Vvedite plnoe nazvanie mesyaca: ");
	z=sc2.nextLine();	
	System.out.println(z);
	if ((z.equals("january"))||(z.equals("february"))||(z.equals("december"))){System.out.println("Sezon Zima");}
	if ((z.equals("march"))||(z.equals("april"))||(z.equals("may"))){System.out.println("Sezon Vesna");}
	if ((z.equals("june"))||(z.equals("july"))||(z.equals("august"))){System.out.println("Sezon Leto");}
	if ((z.equals("september"))||(z.equals("october"))||(z.equals("november"))){System.out.println("Sezon Osen");}

//Zadanie 9: 	
	sum=0;
	for (i=0; i<=100; i++){
	sum=sum+i;
	}
	System.out.println(sum);
	
//Zadanie 10: 
	System.out.println("Vvedite chislo a ");
	a=sc.nextInt();
	System.out.println("Vvedite chislo b ");
	b=sc.nextInt();
	System.out.println("Vvedite chislo c ");
	c=sc.nextInt();
	if ((a>b)&&(a<c)||((a<b)&&(a>c))){System.out.println("Summa naibloshego i naimenshego = "+(b+c));}
	if ((b>a)&&(b<c)||((b<a)&&(b>c))){System.out.println("Summa naibloshego i naimenshego = "+(a+c));}
	if ((c>b)&&(c<a)||((c<b)&&(c>a))){System.out.println("Summa naibloshego i naimenshego = "+(a+b));}
	if (a==b){System.out.println("Summa naibloshego i naimenshego = "+(a+c));}
	else {
		if (a==c){System.out.println("Summa naibloshego i naimenshego = "+(a+b));}
		else {
			if (c==b){System.out.println("Summa naibloshego i naimenshego = "+(a+c));}
			}
		}

//Zadanie 11:
	while (q){
		System.out.println("Vvedite symbol");
		z=sc2.nextLine();
		if (z.equals("q")) {q=false;}
	}
	System.out.println("Vveden symbol q");

//Zadanie 12:	
	q=true;
	while (q){
		System.out.println("Vvedite stroky");
		z=sc2.nextLine();
		if (z.equals("stop")) {q=false;}
	}
	System.out.println("Vvedena stroka stop");
*/	
//Zadanie 14:	
	int size; 
	System.out.println("Vvedite razmernost matrici");
	size=sc.nextInt();
	int[][] matrix= new int [size][size];
	for (i=0;i<size; i++){
			for (j=0;j<size; j++){
				matrix[i][j]=(int)(Math.random()*10); //Заполняем матрицу случайными числами
			//	System.out.println("Vvedite element matricy matrix["+i+"]["+j+"]");//Вводим элементы вручную
			//	matrix[i][j]=sc.nextInt();
			}
	}
	//Выводим матрицу на экран
	for (i=0;i<size; i++){
			for (j=0;j<size; j++){
			System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
	}
	
	//Считаем суммы элементов на диагонали
	sum=0;
	for (i=0;i<size; i++){sum=sum+matrix[i][i];}
	System.out.print("Summa elementov na diagonaly = "+sum);
	
	}
	

}