<?php

abstract class OreOreIterator {
    private $elements; // 繰り返し処理をする要素
    private $now = 0; // 現在処理を行っている要素

    public function __construct($value) {
        try {
            // 引数が配列でもオブジェクトでもない場合は例外を投げる
            if(!is_array($value) && !is_object($value)) {
                throw new InvalidArgumentException('Type of argument must be array or object.');
            } else {
                $this->elements = (array)$value;
            }
        } catch(Exception $e) {
            echo $e->getMessage();
            exit;
        }
    }

    // 次があるか
    public function hasNext() {
        if(isset($this->elements[$this->now])) {
            return true;
        } else {
            return false;
        }
    }

    // 次を返す
    public function next() {
        $tmp = $this->elements[$this->now];
        $this->now++;
        return $tmp;
    }
}
