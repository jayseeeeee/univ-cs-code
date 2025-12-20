// This can be seen by other methods in this class

// Class-level variable
int x = 1;

// Local-level variable
void main() {
    // 'x' and 'y' can only be seen by this method and not 'myMethod'
    int x = 3; // Java will prioritize this local 'x' over the class 'x'
    int y = 2;
    myMethod();
}

void myMethod() {
    // 'z' ca only be seen by this method and not 'main' method
    int z = 3;
}
