package main

import "fmt"

func main() {
	factory := &Factory{}
	productA := factory.CreateFactory("A")
	productB := factory.CreateFactory("B")
	productA.Use()
	productB.Use()
}

type Product interface {
	Use()
}
type ConcreteProductA struct {
}

func (p *ConcreteProductA) Use() {
	fmt.Println("工厂构建A")
}

type ConcreteProductB struct{}

func (p *ConcreteProductB) Use() {
	fmt.Println("工厂构建B")
}

type Factory struct {
}

func (f *Factory) CreateFactory(product string) Product {
	switch product {
	case "A":
		return &ConcreteProductA{}
	case "B":
		return &ConcreteProductB{}
	default:
		return nil

	}
}
