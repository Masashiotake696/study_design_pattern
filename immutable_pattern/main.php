<?php

require_once('./Person.php');
$hart = new Hart(1000, 'red');
$otake = new Person('otake', 174, 65, $hart);

$otake2 = $otake->setName('otake clone');

var_dump($otake);
$otake->getHart()->setWeight(20);
var_dump($otake);
var_dump($otake2);
