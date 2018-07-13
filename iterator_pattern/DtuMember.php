<?php
require_once('./Collection.php');
require_once('./DtuIterator.php');
require_once('./Person.php');

class DtuMember implements Collection {
    private $members = array();

    public function __construct(array $members = null) {
        if(!is_null($members)) {
            $this->members = $members;
        }
    }

    // イテレータを返す
    public function getIterator() {
        return new DtuIterator($this->members);
    }

    // DTUに加入
    public function joinDtu(Person $person) {
        $this->members[] = $person;
    }
}
