package hw5.Family;

import java.util.Arrays;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    static {
        System.out.println("загружается новый класс Family");
    }

    {
        this.children = new Human[1];
        System.out.println("создается новый объект Family");
    }

    Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public void addChild(Human child) {
        if (children[0] != null) {
            Human[] childrenNew = new Human[children.length + 1];
            System.arraycopy(children, 0, childrenNew, 0, children.length);
            childrenNew[children.length] = child;
            children = childrenNew;
        } else {
            children[0] = child;
        }
    }

    public boolean deleteChild(int index) {
        if (index >= children.length || children[index] == null) {
            return false;
        } else {
            System.arraycopy(children, index + 1, children, index, children.length - 1 - index);
            Human[] newChildren = new Human[children.length - 1];
            newChildren = children;
            children = null;
            children = newChildren;

            return true;
        }
    }


    private int findNextFreeCell() {
        for (int i = children.length - 1; i >= 0; i--) {
            if (children[i] != null)
                return i + 1;
        }
        return 0;
    }

    public int countFamily() {
        return findNextFreeCell() + 2;
    }

    public Human getMother() {
        return this.mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return this.father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return this.children;
    }

    public void setChildren(Human child) {
        child.setFamily(this);
        addChild(child);
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{\n mother= " + mother +
                "father= " + father +
                "children= " + Arrays.toString(children) + "\n" +
                "pet= " + pet +
                "}\n ";
    }

    @Override
    protected void finalize() {
        System.out.println("Deleting an instance of Family");
    }
}

/* Решите какие поля стоит использовать для сравнения в методе equals() (к примеру, привычки животного могут меняться).*/