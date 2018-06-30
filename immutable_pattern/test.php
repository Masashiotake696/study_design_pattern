<?php

require_once('./Person.php');

$ims1 = new Person('masashi', 174, 65);

var_dump($ims1->getName());
var_dump($ims1->getHeight());
var_dump($ims1->getWeight());

$ims2 = $ims1->setName('masashi clone');

var_dump($ims1);
var_dump($ims2);
var_dump($ims1);
