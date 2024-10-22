package ru.oop.task2;

/**
 * Транспорт, который может ехать до позиции
 * и передавать свое текущее местоположение
 */
public interface Transport extends Positioned {

    /**
     * Передвижение до позиции вместе с человеком
     *
     * @param destination место назначения
     * @param person      пассажир
     */
    public void moveTo(Position destination, Person person);
}
