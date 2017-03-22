package by.htp.library.dz;

public class Library {
private PrintedEdition lib[]; //объявляем массив объектов класса Печатные издания 
private int size; //переменная определяющая изначальный размер массива
private int index; //переменная для индексации элементов массива

/*public Library(){
		super();
		}
*/
public Library(int size){ //Конструктор класса 
	lib = new PrintedEdition[size]; //создаем массив lib в котором будут хранится издания; 
	this.size=size;
	this.index = 0;	//Задаем начальное значение индекса для ячеек массива
		//this.type = type;
		}
		
public void addItem(int index, PrintedEdition printedEdition){//Добавление элемента в массив 
	this.lib[index]=printedEdition;
	}
public PrintedEdition getItem(int index){
	return(this.lib[index]);
	}
public void printLibrary (){//Выводит всю библиотеку
	for (int i=0; i<this.size; i++){
		System.out.print(this.lib[i].getType()+" * ");
		System.out.print(this.lib[i].getTitle()+" * ");
		System.out.println(this.lib[i].getPrice()+" * ");
		
		}
}

public int Size(){ //Возвращает размер библиотеки
	return size;
}

}
