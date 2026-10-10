
#include <stdio.h>

int main() {
    char s[100];
    int i, state = 0;

    printf("Enter a string: ");
    scanf("%99s", s);

    for (i = 0; s[i] != '\0'; i++) {
        switch (state) {
            case 0:
                if (s[i] == 'a')
                    state = 1;
                break;

            case 1:
                if (s[i] == 'a')
                    state = 2;
                break;

            case 2:
                state = 2;
                break;
        }
    }

    if (state == 2)
        printf("String Rejected");
    else
        printf("String Accepted");

    return 0;
}
