#include <iostream>
using namespace std;

// declare variable untuk 2 stack
#define MAX 10
int arr1[MAX];
int arr2[MAX];
int top1 = -1;
int top2 = -2;

// jika data yang akan dimasukkan lebih besar dari data yang ada pada top stack pada stack pertama, pop lah data pada top stack pertama dan push ke stack kedua
// kemudian setelah data masuk, pop semua data dari stack kedua dan push ke stack pertama
void Algoritma(int new_data) {
      if (new_data > arr1[top1]) {
            arr2[++top2] = arr1[top1];
            top1--;
      }
      // top1++;
      arr1[++top1] = new_data;
}

void PrintStack1() {
      cout << "Stack 1: ";
      for (int i = 0; i <= top1; i++) {
            cout << arr1[i] << " ";
      }
}

void PrintStack2() {
      cout << "Stack 2: ";
      for (int i = 0; i <= top2; i++) {
            cout << arr2[i] << " ";
      }
}

int main() {
	
	// memanggil algoritma yang diminta
      Algoritma(12);
      Algoritma(76);
      Algoritma(45);
      Algoritma(34);
      Algoritma(6);
      Algoritma(13);
      Algoritma(21);
      Algoritma(5);
      Algoritma(10);
      Algoritma(89);

      PrintStack1();
      cout << endl;
      PrintStack2();

      cout << endl;

      // memindahkan semua data stack 2 ke stack 1
      while(top2 != 0){
            top1++;
            arr1[top1] = arr2[top2]; 
            top2--;
      }

      cout << endl;
      
      PrintStack1();
	
}

