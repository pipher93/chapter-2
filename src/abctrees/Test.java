/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abctrees;

/**
 *
 * @author AULA6
 */
public class Test {

    public static void main(String args[]) {
        Tree t = new Tree();
        int vs[] = {52, 15, 3, 18, 9, 6, 12, 24, 30, 27, 33};
        for (int i = 0; i < vs.length; i++) {
            t.add(vs[i]);
        }
        System.out.println("Camino hasta el 11");
        t.printPath(33);


        System.out.println(" Las hojas del arbol son ");
        t.printLeafs();

     

       
    }

}
