package ua.asagayda.HomeWork.Task01_ImitationArrayList;

class Main {


    public static void main(String[] args) {

        ListImitation imitation = new ListImitation(3);
        imitation.addSymbol(1);
        imitation.listOutput();
        imitation.addSymbol(2);
        imitation.listOutput();
        imitation.addSymbol(3);
        imitation.listOutput();
        imitation.addSymbol(4);
        imitation.listOutput();
        imitation.addSymbol(5);
        imitation.listOutput();
        imitation.addSymbol(6);
        imitation.listOutput();
        imitation.addSymbol(7);
        imitation.listOutput();
        imitation.addSymbol(8);
        imitation.listOutput();
        imitation.addSymbol(9);
        imitation.listOutput();
        imitation.addSymbol(10);
        imitation.listOutput();
        imitation.addSymbol(11);
        imitation.listOutput();
        imitation.deleteElementByIndex(0);
        imitation.listOutput();
//        imitation.deleteElementByIndex(15);
//        imitation.listOutput();
        imitation.addLength(10);
        imitation.listOutput();
        imitation.changeElementByIndex(23, 10);
        imitation.listOutput();
        imitation.decreaseLength(1);
        imitation.listOutput();
        imitation.changeElementByIndex(0, 1);
        imitation.listOutput();
        imitation.addSymbol(2);
        imitation.listOutput();
        imitation.addSymbol(3);
        imitation.listOutput();
        imitation.addSymbol(6);
        imitation.listOutput();
        imitation.addSymbol(5);
        imitation.listOutput();
        imitation.addSymbol(4);
        imitation.listOutput();

        imitation.bubbleSort();
        imitation.listOutput();

        imitation.printListRevers();
        imitation.listOutput();

//        как горячими клавишами вызвать создание екземпляра класса,
//        не прописывая все руками, как ниже?
//        ListImitation imitation1 = new ListImitation(3);
//        imitation1.listOutput();
        imitation.addSymbol(6);
        imitation.addSymbol(6);
        imitation.addSymbol(1);
        imitation.addSymbol(2);
        imitation.addSymbol(3);
        imitation.addSymbol(4);
        imitation.addSymbol(4);
        imitation.addSymbol(4);
        imitation.listOutput();
        imitation.removeDuplicates();
        imitation.listOutput();


    }
}

