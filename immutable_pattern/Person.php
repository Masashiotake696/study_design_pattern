<?php
require_once('./Hart.php');

class Person {
    private $name;
    private $height;
    private $weight;
    private $hart;

    public function __construct(string $name, int $height, int $weight, Hart $hart) {
        $this->name = $name;
        $this->height = $height;
        $this->weight = $weight;
        $this->hart = $hart;
    }

    public function getName() {
        return $this->name;
    }

    public function setName(string $name) {
        $clone = $this->getCloneInstance();
        $clone->name = $name;
        return $clone;
    }

    public function getHeight() {
        return $this->height;
    }

    public function setHeight(int $height) {
        $clone = $this->getCloneInstance();
        $clone->height = $height;
        return $clone;
    }

    public function getWeight() {
        return $this->weight;
    }

    public function setWeight(int $weight) {
        $clone = $this->getCloneInstance();
        $clone->weight = $weight;
        return $clone;
    }

    public function getHart() {
        return $this->hart;
    }

    private function getCloneInstance() {
        $clone = clone $this;
        $clone->hart = clone $this->getHart();
        return $clone;
    }
}
