
#include <stdio.h>
#include <string.h>

int main() {
    char s[100];
    int i, state = 0;

    printf("Enter binary string: ");
    scanf("%99s", s);

    for (i = 0; s[i] != '\0'; i++) {
        switch (state) {
            case 0:
                state = (s[i] == '1') ? 1 : 0;
                break;

            case 1:
                state = (s[i] == '0') ? 2 : 1;
                break;

            case 2:
                state = (s[i] == '1') ? 3 : 0;
                break;

            case 3:
                state = (s[i] == '1') ? 1 : 2;
                break;
        }
    }

    if (state == 3)
        printf("String Accepted");
    else
        printf("String Rejected");

    return 0;
}
