#include <stdio.h>
#include <stdlib.h>

int main(void) {
    char input[100];
    char *end;
    long turns;
    int attempts = 0;

    printf("Welcome to Rock, Scissors, Dynamite (because Paper never made "
           "sense)!\n");

    while (attempts < 3) {
        printf("How many turns would you like to play? (select between 3-9)\n");

        if (fgets(input, sizeof input, stdin) == NULL) {
            printf("Input error.\n");
            return 1;
        }

        turns = strtol(input, &end, 10);

        if (end == input) {
            printf("Your input was not an integer.\n");
        } else if (*end != '\n' && *end != '\0') {
            printf("Please only enter an integer.\n");
        } else if (turns < 3 || turns > 9) {
            printf("Please only select numbers between 3 and 9.\n");
        }
    }

    printf("Too many invalid attempts.\n");
    return 1;
}