package br.com.spectlife.controller;

import br.com.spectlife.model.animal.Animal;
import br.com.spectlife.model.animal.Locomotion;
import br.com.spectlife.model.animal.TypeFood;
import br.com.spectlife.model.animal.TypeReprodution;
import br.com.spectlife.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/animalia")
public class AnimalController {
    @Autowired
    AnimalRepository animalRepository;

    @RequestMapping("/register")
    public String getForm(Animal animal, Model model) {
        model.addAttribute("animal", animal);
        List<Locomotion> locomotionList = List.of(Locomotion.values());
        List<TypeFood> typeFoodList = List.of(TypeFood.values());
        List<TypeReprodution> typeReprodutionList = List.of(TypeReprodution.values());
        model.addAttribute("locomotionList", locomotionList);
        model.addAttribute("typeFoodList", typeFoodList);
        model.addAttribute("typeReprodutionList", typeReprodutionList);
        return "animals/form";
    }

    @GetMapping("/animals")
    public ModelAndView getAll(ModelAndView modelAndView) {
        modelAndView.setViewName("animals/list");
        List<Animal> students = animalRepository.findAll();
        modelAndView.addObject("animals", students);
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(Animal animal, ModelAndView modelAndView) {
        animalRepository.save(animal);
        modelAndView.setViewName("animals/list");
        modelAndView.setViewName("redirect:/animalia/animals");
        System.out.println(animalRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable(value = "id") Long id,
                                   ModelAndView modelAndView) {
        animalRepository.deleteById(id);
        modelAndView.setViewName("animals/list");
        modelAndView.setViewName("redirect:/animalia/animals");
        return modelAndView;
    }

    @GetMapping("/edit")
    public ModelAndView edit(Long id, ModelAndView modelAndView) {
        Animal animal = animalRepository.findById(id).get();
        modelAndView.addObject("animal", animal);
        modelAndView.setViewName("animals/form");
        return modelAndView;
    }
}