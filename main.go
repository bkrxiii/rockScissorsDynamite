package main

import "fmt"

// lets make a list with all the options

func main() {
	fmt.Println("Let's play 'Rock, Scissors, Dynamite'!")
	var playerID string = makePlayer()
	var turns int = setupGame()
	fmt.Printf("Hello %v, let's play best out of %v rounds.", playerID, turns)
	// game(turns, playerID)
}

func setupGame() int {
	var howManyTurns int

	fmt.Print("How many turns would you like to play? ")
	fmt.Scan(&howManyTurns)
	
	// add max & min turns next
	
	
	// error handling:
	// handling for turns entered as floats or strings in future,
	// account for neg input, use casting to uint? = NO, should be used, need to look more, start here: https://stackoverflow.com/questions/63105394/in-go-when-should-you-use-uint-vs-int


	fmt.Printf("Thank you we well play %v turns \n", howManyTurns)
	return howManyTurns
}


// func game(rounds int, name string) {
// 	for i := 1 ; i <= rounds ; i = i+1 {
// 		turn(i)
// 	}
// }


func turn(x int) {

} 

func makePlayer() string {
	var playerName string

	fmt.Print("Please enter your name: ")
	fmt.Scan(&playerName)
	
	// should do clean the input before returning it
	// if int & neg change to poss else nothing
	
	// fmt.Println("Thank you " + playerName + ", let's play a game!")
	return playerName
}