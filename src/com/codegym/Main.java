package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        System.out.println("Nhập số lượng phần tử muốn nhập: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            numberList.add((int) (Math.random() * (100 - 1) + 1));
        }
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + " ");
        }
        //Xóa phần tử trùng nhau, phần tử bị trùng sẽ xóa đi.
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if (!newList.contains(numberList.get(i))) {
                newList.add(numberList.get(i));
            }
        }
        System.out.println("\nDanh sách sau khi xóa phần tử trùng nhau");
        for (int element : newList) {
            System.out.print(element + " ");
        }
        System.out.print("\n");
        //In ra danh sách sinh viên.
        int choice = -1;
        List<String> nameStudentList = new ArrayList<>();
        System.out.println("----MENU DANH SÁCH SINH VIÊN----");
        System.out.println("1. Thêm sinh viên.");
        System.out.println("2. Xóa sinh viên.");
        System.out.println("3. Sửa tên sinh viên.");
        System.out.println("4. In ra danh sách sinh viên.");
        System.out.println("5. Thoát.");
        while (true) {
            System.out.println("Xin mời lựa chọn: ");
            choice = scanner.nextInt();
            if (choice == 5) {
                break;
            }
            switch (choice) {
                case 1: {
                    System.out.println("----Thêm sinh viên----");
                    System.out.println("Nhập số lượng sinh viên muốn nhập: ");
                    int size = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < size; i++) {
                        System.out.println("Nhập tên sinh viên: ");
                        String name = scanner.nextLine();
                        nameStudentList.add(name);
                    }
                    break;
                }
                case 2: {
                    System.out.println("----Xóa sinh viên----");
                    System.out.println("Nhập vị trí sinh viên muốn xóa: ");
                    int index = scanner.nextInt();
                    nameStudentList.remove(index-1);
                    break;
                }
                case 3: {
                    System.out.println("----Sửa tên sinh viên----");
                    System.out.println("Nhập vị trí muốn sửa:");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập lại tên sinh viên: ");
                    String newName = scanner.nextLine();
                    nameStudentList.set(index-1,newName);
                    break;
                }
                case 4: {
                    System.out.println("----Danh sách sinh viên----");
                    for (int i = 0; i < nameStudentList.size(); i++) {
                        System.out.println((i+1)+". "+nameStudentList.get(i));
                    }
                    break;
                }
            }
        }
    }

    ;


}

