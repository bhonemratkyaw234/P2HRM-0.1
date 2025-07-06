/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagementUi;


import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;
 import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.util.List;



public class TreeExample {
    public static void main(String []args) {
         SwingUtilities.invokeLater(() -> {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        createAndShowTree();
    });

}
     private static void createAndShowTree(){
         int categoryCount = Integer.parseInt(JOptionPane.showInputDialog("Enter number of categories"));
         DefaultMutableTreeNode root = new DefaultMutableTreeNode("Custom Tree");
         
         for (int i = 0; i < categoryCount; i++){
             String category = JOptionPane.showInputDialog("EnterName for Category " + (i + 1)+ ":");
             if(category == null || category.trim().isEmpty()) {
                      JOptionPane.showMessageDialog(null, "Cancelled. Skipping remaining items");
                      break;
             }
             DefaultMutableTreeNode categoryNode = new DefaultMutableTreeNode(category);
             
             
             int itemCount = Integer.parseInt(JOptionPane.showInputDialog("How Many Items in'" + category + "'?"));
             
              for (int j = 0 ; j < itemCount; j++) {
                  
                  
                  String item = JOptionPane.showInputDialog("Enter Item " + (j + 1) + "for" + category + ":");
                  
                  if(item == null || item.trim().isEmpty()) {
                      JOptionPane.showMessageDialog(null, "Cancelled. Skipping remaining items");
                      break;
                  }
                  categoryNode.add(new DefaultMutableTreeNode(item));
                  
              }
              root.add(categoryNode);
         }
                
              JTree tree = new JTree(root);
              JScrollPane treeview = new JScrollPane(tree);
        
              JFrame frame = new JFrame("Custom JTree");
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.add(treeview);
              frame.setSize(300,300);
              frame.setVisible(true);
              
        
    }
     }
