package ua.asagayda.HomeWork.Task01_ImitationArrayList;

class Main {


    public static void main(String[] args) {


        ListImitation imitation = new ListImitation(12);

        imitation.
//		imitation.createList(arrTest2, 12);
//		1) как сделать метод, что бы он возвращал массив с заданным именем и нужной длинной? 
//		подозреваю что это должен быть инстанс объект, возможно должен передаваться через конструктор.


        imitation.listOutput();

        imitation.addSymbolToList(1);
        imitation.addSymbolToList(2);
        imitation.addSymbolToList(3);
        imitation.addSymbolToList(4);
        imitation.addSymbolToList(5);
        imitation.addSymbolToList(6);
        imitation.addSymbolToList(7);
        imitation.addSymbolToList(8);
        imitation.addSymbolToList(9);

        imitation.listOutput();


        imitation.changeElementByIndex(0, 100);
        imitation.listOutput();


        imitation.deleteElementByIndex(0);
        imitation.listOutput();

//		2) не меняется ссылка на объект который был локальным. 
//		наверное так же наверное нужно как то внедрять инстанс объект.  
        imitation.addLength(4);
        System.out.println("arrTest    addLength = ");

        imitation.listOutput();
//		2) не меняется ссылка на объект который был локальным. 
//		наверное так же наверное нужно как то внедрять инстанс объект.

        imitation.decreaseLength(4);

        System.out.println("arrTest setNewLength = ");
//		2) не меняется ссылка на объект который был локальным. 
//		наверное так же наверное нужно как то внедрять инстанс объект.

        imitation.listOutput();

        imitation.printListRevers();


    }

}
