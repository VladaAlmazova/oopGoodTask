package ru.oop.task2;

/**
 * Транспорт, который может ехать до позиции
 * и передавать свое текущее местоположение
 * в конструкторе должен принимать объект Person
 */
public interface Transport extends Positioned {

    /**
     * Передвижение до позиции вместе с человеком
     * @param destination
     */
    public void moveTo(Position destination);
}
