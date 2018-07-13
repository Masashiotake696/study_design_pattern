<?php
require_once('./OreOreIterator.php');

class DtuIterator extends OreOreIterator {
    // おじさん(40歳以上)配列を返す
    public function getOzisan() {
        // 返却用配列
        $return_array = [];
        while($this->hasNext()) {
            $member = $this->next();
            if($member->getAge() >= 40) {
                $return_array[] = $member;
            }
        }
        return $return_array;
    }

    // 若者(25歳以下)配列返す
    public function getWakamono() {
        // 返却用配列
        $return_array = [];
        while($this->hasNext()) {
            $member = $this->next();
            if($member->getAge() <= 25) {
                $return_array[] = $member;
            }
        }
        return $return_array;
    }

    // 全要素を配列で返す
    public function getAll() {
        // 返却用配列
        $return_array = [];
        while($this->hasNext()) {
            $return_array[] = $this->next();
        }
        return $return_array;
    }

    // 全要素の名前配列を返す
    public function getAllName() {
        // 返却用配列
        $return_array = [];
        while($this->hasNext()) {
            $member = $this->next();
            $return_array[] = $member->getName();
        }
        return $return_array;
    }
}
