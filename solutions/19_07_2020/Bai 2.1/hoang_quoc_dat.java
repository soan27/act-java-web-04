/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] matranA = new int[3][3];
        int[][] matranB = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for( int j=0 ; j<3; j++)
            {
                System.out.printf("Nhap phan tu hang %d cot %d cua ma tran A : \n", i+1 , j+1);
                matranA[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<3;i++)
        {
            for( int j=0 ; j<3; j++)
            {
                System.out.printf("Nhap phan tu hang %d cot %d cua ma tran B : \n", i+1 , j+1);
                matranB[i][j] = sc.nextInt();
            }
        }
        //Hien 2 ma tran
        System.out.println("Ma tran A:");
        for(int i=0;i<3;i++)
        {
            for( int j=0 ; j<3; j++)
            {
                System.out.printf(" %d ",matranA[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Ma tran B:");
        for(int i=0;i<3;i++)
        {
            for( int j=0 ; j<3; j++)
            {
                System.out.printf(" %d ",matranB[i][j]);
            }
            System.out.println("");
        }
        int tongHang=0;
        int tongCot=0;
        for(int i=0;i<3;i++)
        {
            tongHang=0;
            tongCot=0;
            for( int j=0 ; j<3; j++)
            {
                tongHang=tongHang + matranA[i][j]+matranB[i][j];
                tongCot=tongCot + matranA[j][i]+matranB[j][i];
            }
            System.out.printf("Tong hang %d cua 2 ma tran la : %d\n",i+1,tongHang);
            System.out.printf("Tong cot %d cua 2 ma tran la : %d\n",i+1,tongCot);
        }

    }
    
}
