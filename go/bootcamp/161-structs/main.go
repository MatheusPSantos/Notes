package main

import (
	"fmt"
	"strings"
)

type song struct {
	title, artist string
}

type playlist struct {
	genre string

	songs []song
}

func main() {
	var (
		name, lastname   string
		age              int
		name2, lastname2 string
		age2             int
	)

	name, lastname, age = "Pablo", "Picasso", 91
	name2, lastname2, age2 = "Sigmund", "Freud", 83

	fmt.Println("Picasso: ", name, lastname, age)
	fmt.Println("Freud: ", name2, lastname2, age2)

	type person struct {
		name, lastname string
		age            int
	}

	var picasso person
	var freud person

	picasso.name = "Pablo"
	picasso.lastname = "Picasso"
	picasso.age = 91

	freud.name = "Sigmund"
	freud.lastname = "Freud"
	freud.age = 83

	fmt.Printf("\nPicasso: %+v", picasso)
	fmt.Printf("\nFreud: %+v", freud)

	fmt.Printf("\n%s\n", strings.Repeat("-", 40))
	song1 := song{title: "Wonderwall", artist: "oasis"}
	song2 := song{title: "super sonic", artist: "oasis"}

	fmt.Printf("song1: %+v\nsong2: %+v\n", song1, song2)

	if song1.title == song2.title && song1.artist == song2.artist {
		fmt.Println("songs are equal.")
	} else {
		fmt.Println("songs are not equal.")
	}

	song1.title = song2.title

	if song1 == song2 {
		fmt.Println("songs are equal.")
	} else {
		fmt.Println("songs are not equal.")
	}

	fmt.Printf("\n%s\n", strings.Repeat("-", 40))
	songs := []song{song1, song2}
	rock := playlist{genre: "indie rock", songs: songs}

	fmt.Printf("\n%+v\n", rock)

	fmt.Printf("%-20s %-20s\n", "TITLE", "ARTIST")
	for _, s := range rock.songs {
		fmt.Printf("%-20s %-20s\n", s.title, s.artist)
	}

}
