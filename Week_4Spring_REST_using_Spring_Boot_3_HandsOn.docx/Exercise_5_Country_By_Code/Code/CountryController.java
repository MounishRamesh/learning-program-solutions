

@GetMapping("/countries/{code}")
public Country getCountryByCode(@PathVariable String code) {
    return getAllCountries().stream()
            .filter(c -> c.getCode().equalsIgnoreCase(code))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Country not found"));
}
