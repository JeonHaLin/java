package no12;

import java.util.*;

abstract class Shape {
    private Shape next;
    public Shape() { next = null; }
    public void setNext(Shape obj) { next = obj; }
    public Shape getNext() { return next; }
    public abstract void draw();
}

class Line extends Shape {
    public void draw() { System.out.println("Line"); }
}

class Rect extends Shape {
    public void draw() { System.out.println("Rect"); }
}

class Circle extends Shape {
    public void draw() { System.out.println("Circle"); }
}

class GraphicEditor {
    private ArrayList shapes;
    public GraphicEditor() {
        shapes = new ArrayList();
    }

    public void subMenuInsert() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Line(1), Rect(2), Circle(3) >> ");
                int selectSubMenu = scan.nextInt();
                if (selectSubMenu < 1 || selectSubMenu > 3) {
                    throw new IllegalArgumentException();
                }
                switch (selectSubMenu) {
                    case 1:
                        shapes.add(new Line());
                        break;
                    case 2:
                        shapes.add(new Rect());
                        break;
                    case 3:
                        shapes.add(new Circle());
                        break;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
                scan.nextLine();
            } catch (IllegalArgumentException f) {
                System.out.println("Input only number 1 ~ 3!");
                scan.nextLine();
            }
        }
    }

    public void subMenuDelete() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the index of the shape to delete >> ");
                int deleteIndex = scan.nextInt();
                if (deleteIndex < 0 || deleteIndex >= shapes.size()) {
                    System.out.println("Cannot delete");
                    break;
                }
                shapes.remove(deleteIndex);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
                scan.nextLine();
            }
        }
    }

    public void showAll() {
        System.out.println("Current shapes:");
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = (Shape) shapes.get(i);
            shape.draw();
        }
        System.out.println();
    }

    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("start graphic editor Beaty");
        while (true) {
            try {
                System.out.print("Insert(1), Delete(2), Show All(3), Exit(4) >> ");
                int selectMenu = scan.nextInt();
                if (selectMenu < 1 || selectMenu > 4) {
                    throw new IllegalArgumentException();
                }
                switch (selectMenu) {
                    case 1:
                        subMenuInsert();
                        break;
                    case 2:
                        subMenuDelete();
                        break;
                    case 3:
                        showAll();
                        break;
                    case 4:
                        System.out.println("Exit beauty.");
                        return;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
                scan.nextLine();
            } catch (IllegalArgumentException f) {
                System.out.println("Input only number 1 ~ 4!");
                scan.nextLine();
            }
        }
    }
}

public class GraphicEditorEx {
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.menu();
    }
}

