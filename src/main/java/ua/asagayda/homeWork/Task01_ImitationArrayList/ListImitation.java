package ua.asagayda.homeWork.Task01_ImitationArrayList;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ListImitation {
    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public ListImitation(int size) {
        if (size<1){
            throw new IllegalArgumentException("int \"size\" cannot be zerro or less than zero. " +
                    "ua.asagayda.homeWork.Task01_ImitationArrayList.ListImitation.ListImitation");
        }

        arr = new int[size];

    }

    //	resize array +


    public void addSymbol(int value) {
        if (value == 0) {
            throw new IllegalArgumentException("int x cannot be zerro. In ua.asagayda.AddSymbolToArray");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = value;
                break;
            } else if (i == arr.length - 1 && arr[i] != 0) {

                int[] arr2 = new int[((arr.length + 1) / 2) * 3];
                for (int J = 0; J < arr.length; J++) {
                    arr2[J] = arr[J];
                }
                arr = arr2;
                arr[i + 1] = value;
                break;
            }
        }
    }

    public void changeElementByIndex(int index, int value) {
        if (value == 0) {
            throw new IllegalArgumentException("int x cannot be zerro. " +
                    "In ua.asagayda.HomeWork.Task01_ImitationArrayList.ListImitation.changeElementByIndex");
        }

        if (index > arr.length - 1) {
            throw new IllegalArgumentException("index cannot be greater than the length of the array. " +
                    "In ua.asagayda.HomeWork.Task01_ImitationArrayList.ListImitation.changeElementByIndex");
        }


        arr[index] = value;

    }

    public void deleteElementByIndex(int index) {
        if (index > arr.length - 1) {
            throw new IllegalArgumentException("index cannot be greater than the length of the array. " +
                    "In ua.asagayda.HomeWork.Task01_ImitationArrayList.ListImitation.deleteElementByIndex");
        }

        int[] tempArray = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            tempArray[i] = arr[i];
        }

        for (int i = index; i < arr.length - 1; i++) {
            tempArray[i] = arr[i + 1];
        }

        arr = tempArray;

    }

    public void addLength(int newLength) {
        int[] tempArray = new int[arr.length + newLength];

        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    public void decreaseLength(int newLength) {
        if (newLength > arr.length || newLength <= 0){
            throw new IllegalArgumentException("should be less than the length of the array " +
                    "and greater then zero");
        }


        int[] b = new int[newLength];

        for (int i = 0; i < b.length; i++) {
            b[i] = arr[i];
        }
        arr = b;

    }

    public void printList() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void printListRevers() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length - 1 - i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();

    }

    public void sortListBubble() {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    //Идея подсказала что можно ставить анотацию @NotNull, это нормально?
    // Или лучше импользовать старую конструкцию, как ниже, по аналогии как
    // для масива second?

    public void addArrey(int[] secondArr) {
        if (secondArr == null) {
            throw new IllegalArgumentException("incoming array must not be null" +
                    "In ua.asagayda.HomeWork.Task01_ImitationArrayList.ListImitation.concat");
        }

        if (secondArr.length<=countZeroInArr()){
            for (int i = 0; i <secondArr.length ; i++) {
                for (int j = 0; j <arr.length; j++) {
                    if(arr[j]==0){
                        arr[j]=secondArr[i];
                        break;
                    }

                }
            }
        }
        else {
            int[] temp = new int[arr.length + secondArr.length];

            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }

            for (int i = 0; i < secondArr.length; i++) {
                temp[arr.length + i] = secondArr[i];
            }
            arr = temp;
        }
    }

    public void removeDuplicates() {
        int countDuplicates = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp[j] = 1;

                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 1) {
                countDuplicates++;
            }
        }

        int[] temp2 = new int[arr.length - countDuplicates];
        if (countDuplicates > 0) {
            for (int i = 0; i < temp2.length; i++) {
                if (temp[i] != 1) {
                    temp2[i] = arr[i];
                }
            }
        }
        arr = temp2;
    }

    public int findIndexFirstElement(int element) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public void findIndexFirstElement2(int element) {
        int index;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                System.out.println(index);
                break;
            } else {
                if (i == arr.length - 1) {
                    index = -1;
                    System.out.println(index);

                }
            }
        }
    }

    public void mixingElement() {
        int[] temp = new int[arr.length];
//        int[] marker = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int marker = 0;
            while (marker == 0) {
                int a = (int) (Math.random() * arr.length);
                if (temp[a] == 0) {
                    temp[a] = arr[i];
                    marker = 1;
                }
            }
        }
        arr = temp;
    }
    
    public int countZeroInArr(){
        int countZero = 0;
        for (int a: arr) {
            if(a==0){
                countZero++;
            }
        }
        return countZero;
    }

}



