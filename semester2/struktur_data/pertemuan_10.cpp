#include <iostream>
using namespace std;

struct sel {
	int dat;
};

struct sel pool[256];
struct sel pool2[256];
int stacksize = 0;
int stacksize2 = 0;

bool IsEmpty() {
	if(stacksize == 0) {
		return true;
	}	
	else {
		return false;
	}
};

void ClearStack() {
	stacksize = 0;	
};

void Push(struct sel el) {
	stacksize++;
	pool[stacksize-1] = el;	
};

struct sel TopEl() {
	return pool[stacksize-1];
};

struct sel Pop() {
	struct sel temp;
	temp = pool[stacksize-1];
	stacksize--;
	return temp;
}

bool IsEmpty2() {
	if(stacksize2 == 0) {
		return true;
	}	
	else {
		return false;
	}
};

void ClearStack2() {
	stacksize2 = 0;	
};

void Push2(struct sel el) {
	stacksize2++;
	pool2[stacksize2-1] = el;	
};

struct sel TopEl2() {
	return pool2[stacksize2-1];
};

struct sel Pop2() {
	struct sel temp = pool2[stacksize2-1];
	stacksize2--;
	return temp;
};

main() {
	int a[10] = {12, 56, 76, 44, 51, 89, 55, 11, 80, 52};
	for(int i = 0; i < 10; i++) {
		struct sel elemen = TopEl();
		while((elemen.dat > a[i]) && (stacksize > 0)) {
			Push2(Pop());
			elemen = TopEl();
		}
		elemen.dat = a[i];
		Push(elemen);
		while(stacksize2 > 0) {
			Push(Pop2());
		}
	}
	for(int i = 0; i < stacksize; i++) {
		cout << pool[i].dat << " ";
	}
}

