/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abctrees;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Stack;
import javax.swing.JFrame;

/**
 *
 * @author AULA6
 */
public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    public void add(int v) {

        Node n = new Node(v);
        if (root == null) {
            root = n;
        } else {
            Node aux = root, p = null;
            while (aux != null) {
                p = aux;
                if (v > aux.value) {
                    aux = aux.right;
                } else if (v < aux.value) {
                    aux = aux.left;
                } else {
                    return;
                }
            }
            if (v > p.value) {
                p.right = n;
            } else {
                p.left = n;
            }
        }
    }

    public void printPath(int v) {

        Node aux = root;
        while (aux != null) {
            System.out.println(" " + aux.value);
            if (v == aux.value) {
                System.out.println();
                return;

            }
            if (v > aux.value) {
                aux = aux.right;
            } else {
                aux = aux.left;
            }

        }
        System.out.println("No encontrado");
    }

   

    public void printLeafs() {

        Node aux = root;
        Stack<Node> stack = new Stack<Node>();
        while (aux != null) {
            stack.push(aux);
            aux = aux.left;
        }
        while (!stack.empty()) {
            aux = stack.pop();
            if (aux.left == null && aux.right == null) {
                System.out.print(" " + aux.value);
            }
            aux = aux.right;
            while (aux != null) {
                stack.push(aux);
                aux = aux.left;

            }
        }
        System.out.println();
    }

    public int countLeafs() {
        int counter = 0;
        Node aux = root;
        Stack<Node> stack = new Stack<Node>();

        while (aux != null) {
            stack.push(aux);
            aux = aux.left;
        }
        while (!stack.empty()) {
            aux = stack.pop();
            if (aux.left == null && aux.right == null) {
                counter++;
            }



            aux = aux.right;
            while (aux != null) {
                stack.push(aux);
                aux = aux.left;
            }
        }
        return counter;
    }

    public int levelOf(int v) {

        Node aux = root;
        int level = 0;
        while (aux != null) {
            level++;
            if (v == aux.value) {
                return level - 1;
            }
            if (v > aux.value) {
                aux = aux.right;
            } else {
                aux = aux.left;
            }
        }
        System.out.println("No encontrado ");
        return 0;
    }

    

    
}


