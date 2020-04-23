package ua.asagayda.homeWork.Task01_ImitationArrayList;

class Main {


    public static void main(String[] args) {

        ListImitation imitation = new ListImitation(3);
        imitation.addSymbol(1);
        imitation.printList();
        imitation.addSymbol(2);
        imitation.printList();
        imitation.addSymbol(3);
        imitation.printList();
        imitation.addSymbol(4);
        imitation.printList();
        imitation.addSymbol(5);
        imitation.printList();
        imitation.addSymbol(6);
        imitation.printList();
        imitation.addSymbol(7);
        imitation.printList();
        imitation.addSymbol(8);
        imitation.printList();
        imitation.addSymbol(9);
        imitation.printList();
        imitation.addSymbol(10);
        imitation.printList();
        imitation.addSymbol(11);
        imitation.printList();
        imitation.deleteElementByIndex(0);
        imitation.printList();
//        imitation.deleteElementByIndex(15);
//        imitation.listOutput();
        imitation.addLength(10);
        imitation.printList();
        imitation.changeElementByIndex(23, 10);
        imitation.printList();
        System.out.println("decreaseLength: ");
        imitation.decreaseLength(0);
        imitation.printList();
        imitation.changeElementByIndex(0, 1);
        imitation.printList();
        imitation.addSymbol(2);
        imitation.printList();
        imitation.addSymbol(3);
        imitation.printList();
        imitation.addSymbol(6);
        imitation.printList();
        imitation.addSymbol(5);
        imitation.printList();
        imitation.addSymbol(4);
        imitation.printList();

        imitation.sortListBubble();
        imitation.printList();

        imitation.printListRevers();
        imitation.printList();


        imitation.addSymbol(6);
        imitation.addSymbol(6);
        imitation.addSymbol(1);
        imitation.addSymbol(2);
        imitation.addSymbol(3);
        imitation.addSymbol(4);
        imitation.addSymbol(4);
        imitation.addSymbol(4);
        imitation.printList();
        imitation.removeDuplicates();
        imitation.printList();

        System.out.println(imitation.findIndexFirstElement(7));
        imitation.findIndexFirstElement2(7);
        imitation.findIndexFirstElement2(6);
        imitation.findIndexFirstElement2(0);

        imitation.mixingElement();
        imitation.printList();


//        как горячими клавишами вызвать создание екземпляра класса,
//        не прописывая все руками, как ниже?

        imitation.addArrey(new int[]{1, 2, 3});
        imitation.printList();


    }
}

