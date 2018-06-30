<?php

class Person {
    private $name;
    private $height;
    private $weight;

    public function __construct(string $name, int $height, int $weight) {
        $this->name = $name;
        $this->height = $height;
        $this->weight = $weight;
    }

    public function getName() {
        return $this->name;
    }

    public function setName(string $name) {
        $clone = clone $this;
        $clone->name = $name;
        return $clone;
    }

    public function getHeight() {
        return $this->height;
    }

    public function setHeight(int $height) {
        $clone = clone $this;
        $clone->name = $height;
        return $clone;
    }

    public function getWeight() {
        return $this->weight;
    }

    public function setWeight(int $weight) {
        $clone = clone $this;
        $clone->name = $weight;
        return $clone;
    }
}
