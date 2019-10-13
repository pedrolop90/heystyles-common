package com.heystyles.common.persistence;


import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Converter(
        autoApply = true
)
public class LocalDateTimeAttributeConverter implements AttributeConverter<LocalDateTime, Timestamp> {
    public LocalDateTimeAttributeConverter() {
    }

    public final Timestamp convertToDatabaseColumn(LocalDateTime locDate) {
        return locDate == null ? null : Timestamp.valueOf(locDate);
    }

    public final LocalDateTime convertToEntityAttribute(Timestamp sqlDate) {
        return sqlDate == null ? null : sqlDate.toLocalDateTime();
    }
}

