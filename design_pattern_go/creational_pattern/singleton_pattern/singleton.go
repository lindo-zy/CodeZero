package main

import (
	"fmt"
	"sync"
)

func main() {
	s1 := GetInstance()
	s2 := GetInstance()
	fmt.Println(s1 == s2)
}

type Singleton struct{}

var instance *Singleton
var once sync.Once

func GetInstance() *Singleton {
	once.Do(func() {
		instance = &Singleton{}
	})
	return instance
}
