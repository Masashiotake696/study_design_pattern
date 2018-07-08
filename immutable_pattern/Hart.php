<?php

class Hart {
    private $weight;
    private $color;

    public function __construct(int $weight, string $color) {
        $this->weight = $weight;
        $this->color = $color;
    }

    public function getWeight() {
        return $this->weight;
    }

    public function setWeight(int $weight) {
        $this->weight = $weight;
    }

    public function getColor() {
        return $this->color;
    }

    public function setColor(string $colro) {
        $this->color = $color;
    }

    public function move() {
        echo 'ドクドク';
    }
}
