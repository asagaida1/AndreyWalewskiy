package ua.asagayda.HomeWork.Task01_ImitationArrayList;

public class ListImitation {
    private int[] arr;

    public ListImitation(int size) {
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

                int[] arr2 = new int[((arr.length + 1)/ 2) * 3 ];
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


        int[] b = new int[newLength];

        for (int i = 0; i < b.length; i++) {
            b[i] = arr[i];
        }
        arr = b;

    }

    public void listOutput() {
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

    }

}
