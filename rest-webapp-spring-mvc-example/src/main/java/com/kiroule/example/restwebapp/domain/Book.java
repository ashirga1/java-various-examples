package com.kiroule.example.restwebapp.domain;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Strings.emptyToNull;

/**
 * @author Igor Baiborodine
 */
@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType (propOrder = {"isbn", "author", "title", "price", "category"})
public class Book implements Serializable, Comparable<Book> {

    private String isbn;
    private String author;
    private String title;
    private BigDecimal price;
    private Set<String> categories = Collections.emptySet();

    @XmlElement(name = "isbn")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(@Nonnull final String isbn) {
        this.isbn = checkNotNull(emptyToNull(isbn), "Argument[isbn] must not be null");
    }

    @Nullable
    @XmlElement(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(@Nullable final String author) {
        this.author = emptyToNull(author);
    }

    @Nullable
    @XmlElement(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(@Nullable final String title) {
        this.title = emptyToNull(title);
    }

    @Nullable
    @XmlElement(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(@Nullable final BigDecimal price) {
        this.price = price;
    }

    @Nonnull
    @XmlElement(name = "category")
    public Set<String> getCategory() {
        return new LinkedHashSet<String>(this.categories);
    }

    public void setCategory(@Nonnull final Set<String> categories) {
        this.categories = new LinkedHashSet<String>(checkNotNull(categories,
                "Argument[category] must not be null"));
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (! (o instanceof Book)) {
            return false;
        }
        Book that = (Book) o;
        return Objects.equal(this.isbn, that.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("isbn", isbn)
                .add("author", author)
                .add("title", title)
                .add("price", price)
                .add("categories", categories)
                .toString();
    }

    @Override
    public int compareTo(final Book that) {
        return ComparisonChain.start()
                .compare(this.isbn, that.isbn)
                .result();
    }
}
