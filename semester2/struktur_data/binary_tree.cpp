#include <conio.h>
#include <stdio.h>
#include <iostream>
#include <string.h>
using namespace std;

struct sel
{
  int dat; //Primary Key
  struct sel *left;
  struct sel *right;
};

struct sel *root=NULL, *ptr=NULL, *temp=NULL;

void tambahsimpul(struct sel *simpul)
{   
  if (simpul->dat > temp->dat)  
  {
    if (simpul->left != NULL)
      tambahsimpul(simpul->left);
    else
      simpul->left = temp;
    
  } else
  {
    if (simpul->right != NULL)
      tambahsimpul(simpul->right);
    else
      simpul->right = temp;  
  }
}

void inOrderTrav(struct sel *travCell)
{
  if (travCell->left != NULL) 
    inOrderTrav(travCell->left);  //LEFT
  cout << travCell->dat << endl;     //VISIT --> menampung hasil visit ke stack
  if (travCell->right != NULL) 
    inOrderTrav(travCell->right); //RIGHT
}
void postOrderTrav(struct sel *travCell)
{
  if (travCell->left != NULL) 
    postOrderTrav(travCell->left); //LEFT
  if (travCell->right != NULL) 
    postOrderTrav(travCell->right);  //RIGHT
  cout << travCell->dat << endl;     //VISIT --> menampung hasil visit ke stack
}
void preOrderTrav(struct sel *travCell)
{
  cout << travCell->dat << endl;    //VISIT --> menampung hasil visit ke stack
  if (travCell->left != NULL) 
    preOrderTrav(travCell->left);  //LEFT
  if (travCell->right != NULL) 
    preOrderTrav(travCell->right); //RIGHT
}


int main()
{
  int a[]={56, 34, 23, 54, 22, 71, 65, 66, 90, 10};
  cout<<endl;
  for(int i=0; i<sizeof(a); i++)
  {
    //membuat simpul baru dengan temp
    temp = new sel();
    temp->dat = a[i];
    temp->left = NULL;
    temp->right = NULL;
    if (root==NULL) //memeriksa apakah tree sudah terbentuk
      root = temp; //temp dijadikan root
    else
      tambahsimpul(root);
  }
  cout<<"hasil sort: ";
  inOrderTrav(root);
}
