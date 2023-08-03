import cv2
import numpy as np

# Load the image
image = cv2.imread('Assets/Tiger.jpg')

# Define the transformation matrix for translation

tx, ty = 100, 50 # number of pixels to move along each axis

translation_matrix = np.float32([[1, 0, tx], [0, 1, ty]]) # translation matrix created to be able to apply translation

# Perform the translation
translated_image = cv2.warpAffine(image, translation_matrix, (image.shape[1], image.shape[0]))

# Define the rotation angleS
angle = 45
center = (image.shape[1] // 2, image.shape[0] // 2)

# Perform the rotation
rotation_matrix = cv2.getRotationMatrix2D(center, angle, 1.0)
rotated_image = cv2.warpAffine(image, rotation_matrix, (image.shape[1], image.shape[0]))

# Define the scaling factors
scale_x, scale_y = 1.5, 0.5

# Perform the scaling
scaled_image = cv2.resize(image, None, fx=scale_x, fy=scale_y, interpolation=cv2.INTER_LINEAR)

# Define new dimensions for resizing
new_width, new_height = 300, 200

# Perform the resizing
resized_image = cv2.resize(image, (new_width, new_height), interpolation=cv2.INTER_LINEAR)

# Display the original and transformed images
cv2.imshow('Original Image', image)
cv2.imshow('Translated Image', translated_image)
cv2.imshow('Rotated Image', rotated_image)
cv2.imshow('Scaled Image', scaled_image)
cv2.imshow('Resized Image', resized_image)

# Wait for a key press and then close the windows
cv2.waitKey(0)
cv2.destroyAllWindows()
