// Manipula o submit ajax para limpar formulario e esconder o dialogo.
function handleSubmitRequest(args, d, f) {
    if (!args.validationFailed) {
        clearForm(f);
        d.hide();
    }
}

// Limpa formulario.
function clearForm(formName) {
    jQuery('#' + formName).each(function() {
        this.reset();
    });
}