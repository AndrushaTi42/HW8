void main() {
//task 1/2
    System.out.println("Task №1/2");
//создание первого массива
    int[] arr = new int[3];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    //Вывод значений элементов массива в консоль
    for (int index = 0; index < arr.length; index++) {
        if (index == arr.length - 1) {
            System.out.println(arr[index] + ";");
            break;
        }
        System.out.print(arr[index] + ", ");
    }
//создаем второй массив
    double[] arrTwo = {1.57, 7.654, 9.986};
//выводим значения в консоль
    for (int index = 0; index < arrTwo.length; index++) {
        if (index == arrTwo.length - 1) {
            System.out.println(arrTwo[index] + ";");
            break;
        }
        System.out.print(arrTwo[index] + ", ");
    }
//создание третьего массива с 20ю элементами
    int[] arrThree = new int[20];
// присваиваем значение элементам массива
    for (int i = 0; i < arrThree.length; i++) {
        arrThree[i] = i + 1;
    }
//выводим значения элементов массива в консоль
    for (int index = 0; index < arrThree.length; index++) {
        if (index == arrThree.length - 1) {
            System.out.println(arrThree[index] + ";");
            break;
        }
        System.out.print(arrThree[index] + ", ");
    }

//task 3
    System.out.println("Task №3");

//инвертируем элементы первого массива
    for (int i = 0; i < arr.length / 2; i++) {
        int a = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = a;
    }
//выводим значения
    for (int index = 0; index < arr.length; index++) {
        if (index == arr.length - 1) {
            System.out.println(arr[index] + ";");
            break;
        }
        System.out.print(arr[index] + ", ");
    }

//инвертируем элементы второго массива
    for (int i = 0; i < arrTwo.length / 2; i++) {
        double a = arrTwo[i];
        arrTwo[i] = arrTwo[arrTwo.length - 1 - i];
        arrTwo[arrTwo.length - 1 - i] = a;
    }
//выводим значения
    for (int index = 0; index < arrTwo.length; index++) {
        if (index == arrTwo.length - 1) {
            System.out.println(arrTwo[index] + ";");
            break;
        }
        System.out.print(arrTwo[index] + ", ");
    }

    //инвертируем элементы третьего массива
    for (int i = 0; i < arrThree.length / 2; i++) {
        int a = arrThree[i];
        arrThree[i] = arrThree[arrThree.length - 1 - i];
        arrThree[arrThree.length - 1 - i] = a;
    }
//выводим значения
    for (int index = 0; index < arrThree.length; index++) {
        if (index == arrThree.length - 1) {
            System.out.println(arrThree[index] + ";");
            break;
        }
        System.out.print(arrThree[index] + ", ");
    }

//Task 4
    System.out.println("Task №4");
//обратно инвертируем первый целочисленный массив
    for (int i = 0; i < arr.length / 2; i++) {
        int a = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = a;
    }
//прибавляем к нечетным значениям элементов массива единицу
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 != 0) {
            arr[i]++;
        }
    }
//выводим новые значения массива в консоль
    System.out.println(Arrays.toString(arr));
}
