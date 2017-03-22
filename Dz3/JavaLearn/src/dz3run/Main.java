package dz3run;
import java.util.Scanner;
import dz3.Element;
import dz3.Massiv;
import dz3.Sorted;

public class Main {
public static void main(String[] args) {
int maxSize=100;
String option;
Scanner sc = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);
System.out.println("Здравствуйте, Вас приветствует программа автоматической сортировки массивов");
System.out.println("Программа прекратит работу если вы напишите слово stop или введете некорректные данные");
System.out.print("Введите размер массива: ");

	if(sc.hasNextInt()) {
		maxSize=sc.nextInt();
		Massiv mas1 = new Massiv(maxSize);
		System.out.println("Введите auto для заполнения массива случайными числами");
		System.out.println("Введите manual для заполнения массива случайными числами");
		option = sc2.nextLine();
		switch (option){
		case "manual": {
			for (int i=0; i<maxSize; i++){ //Ручной режим (Массив заполняется вручную)
				System.out.print("Введите "+ i + " элемент: ");
				if (sc.hasNextInt()) {mas1.addItem(i, sc.nextInt());}
				else {	System.out.print("Введены некорректные данные"); 
					System.out.println("Работа программы завершена"); 
					break;
					}
			}
		break;}
		case "auto":{
			for (int i=0; i<maxSize; i++) {
				mas1.addItem(i, (int)(Math.random()*100));
				}
		break;}
		default:{
			System.out.println("Введены некорректные данные");
			System.out.println("Работа программы завершена");
			break;}
		}
	
	if (mas1.isEmpty()){ //Если массив не пустой то выводит массив и максимальный и минимальный элементы
	mas1.masPrint();	//Выводим массив
	System.out.println("Максимальный элемент: mas["+mas1.maxItem()+"] = "+mas1.getItem(mas1.maxItem()));//Мax
	System.out.println("Миниимальный элемент: mas["+mas1.minItem()+"] = "+mas1.getItem(mas1.minItem()));//Min	
	boolean stop=true;
	while (stop){
		System.out.println("");
		System.out.println("Дотсупны следующие варианты соровки:");
		System.out.println("Пузырьковая сортировка по возрастанию: введите 1");
		System.out.println("Пузырьковая сортировка по убыванию: введите 2");
		System.out.println("Сортировка методом выбора по возрастанию: введите 3");
		System.out.println("Сортировка методом выбора по убыванию: введите 4");
		System.out.println("Соритровка методом вставки по возрастанию: введите 5");
		System.out.println("Соритровка методом вставки по убыванию: введите 6");
		option = sc2.nextLine();	
		if (option.equals("stop")){stop = false; System.out.println("Введено ключевое слово stop, программа завершена, всего доброго"); break;}
		switch (option){
		
		case "1":{		
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortBubble("up");//Сортировка по возрастанию методом пузыря
			mas2.print();
			System.out.println("Сортировка завершена");
			break;
			}
		
		case "2":{	
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortBubble("down");//Сортировка по убыванию методом пузыря
			mas2.print();
			System.out.println("Сортировка завершена");
			break;
			}
		
		case "3":{	
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortSelect("up");//Сортировка по убыванию методом пузыря
			mas2.print();
			System.out.println("Сортировка завершена");
			break;
			}
		
		case "4":{	
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortSelect("down");//Сортировка по убыванию методом пузыря
			mas2.print();
			System.out.println("Сортировка завершена");
			break;
			}
		case "5":{	
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortInsert("up");//Сортировка по убыванию методом пузыря
			mas2.print();
			System.out.println("Сортировка завершена");
			break;
			}
		
		case "6":{	
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortInsert("down");//Сортировка по убыванию методом пузыря
			mas2.print();
			System.out.println("Сортировка завершена");
			break;
			}
		
		default :{System.out.println("Вы ввели что то не корректное, будем считать что вы опечатались");}
       }
		
		
	}
	
	
	
	
	}
	sc.close();
	sc2.close();
	
	
	
	}
			
	
	


	
	else {
		System.out.println("Введены некорректные данные");
		System.out.println("Работа программы завершена");
	 }
	
	

}

}
