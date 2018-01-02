
#define FizzBuzz "FizzBuzz"
#define Fizz "Fizz"
#define Buzz "Buzz"

/*
 * Is taking up the extra hard disk space to define these worth it? No, it's not since it's only used once
 * 
*/
int main(void){

    int fizzBuzzEnd = 100;
    int i = 0;

    while (i < fizzBuzzEnd){
        if (i % 15 == 0) {
            printf("%s \n", FizzBuzz);
        }
        else if (i % 5 == 0) {
            printf("%s \n", Buzz);
        }
        else if (i % 3 == 0) {
            printf("%s \n", Fizz);
        }
        else {
            printf("%d \n", i);
        }
        i++;
    }

}