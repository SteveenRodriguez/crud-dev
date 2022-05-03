package co.com.sofka.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    //lista los todos
    public Iterable<Todo> list(){
        return repository.findAll();
    }

    //guarda los todos
    public Todo save(Todo todo){
        return repository.save(todo);
    }

    //elimina los todos
    public void delete(Long id){
        repository.delete(get(id));
    }

    //obtiene los todos
    public Todo get(Long id){
        return repository.findById(id).orElseThrow();
    }


}
