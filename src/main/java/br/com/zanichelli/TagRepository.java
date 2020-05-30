package br.com.zanichelli;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TagRepository implements PanacheRepository<Tag> {}
